package kr.green.green.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.green.service.BoardService;
import kr.green.green.vo.BoardVO;
import kr.green.green.vo.MemberVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView boardList(ModelAndView mv) {
		//등록된 모든 게시글을 보는 작업
		List<BoardVO> list = boardService.getBoardList("일반");
//		System.out.println(list);
		mv.addObject("list", list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public ModelAndView boardDetail(ModelAndView mv, Integer bd_num) {
		BoardVO board = boardService.getBoard(bd_num);
		mv.setViewName("/board/detail");
		mv.addObject("board", board);
		return mv;
	}
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView boardRegisterGet(ModelAndView mv) {
		mv.setViewName("/board/register");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView boardRegisterPost(ModelAndView mv, BoardVO board, HttpServletRequest request) {
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		board.setBd_type("일반");
//		System.out.println(board);
		boardService.registerBoard(board, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public ModelAndView boardMsodify(ModelAndView mv, Integer bd_num, HttpServletRequest request) {
		MemberVO user = (MemberVO) request.getSession().getAttribute("user");
		BoardVO board = boardService.getBoard(bd_num);
		if(user != null && board !=  null && user.getMe_id().equals(board.getBd_me_id())) {
			mv.addObject("board",board);
			mv.setViewName("/board/modify");
		}else {
			mv.addObject("bd_num",bd_num);
			mv.setViewName("redirect:/board/detail");
		}
		return mv;
	}
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public ModelAndView boardModifyPost(ModelAndView mv, BoardVO board, HttpServletRequest request) {
		MemberVO user = (MemberVO) request.getSession().getAttribute("user");
//		System.out.println(user);
//		System.out.println(board);
		boardService.modifyBoard(board,user);
		mv.addObject("bd_num", board.getBd_num());
		mv.setViewName("redirect:/board/detail");
		return mv;
	}
}
