package kr.green.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.vo.MemberVO;
//@Controller가 있어야 URL을 분석하여 처리
@Controller
public class HomeController {
	
	//URL을 확인하는 곳, 필수
	//value는 localhost:8080/패키지명을 제외한 부분
	//method는 전달 방식, GET,POST, 생략하면 둘다
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homeGet(ModelAndView mv) {
		mv.setViewName("/main/home");
		mv.addObject("serverTime", "데이터" );
		
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		System.out.println("/login:get :");
		mv.setViewName("/member/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO member) {
		System.out.println("/login:post :" + member);
		mv.setViewName("/member/login");
		return mv;
	}
}



