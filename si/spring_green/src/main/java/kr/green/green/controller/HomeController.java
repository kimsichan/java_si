package kr.green.green.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.green.service.MemberService;
import kr.green.green.vo.MemberVO;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/")
    public ModelAndView main(ModelAndView mv) throws Exception{
        mv.setViewName("/main/home");
        return mv;
    }
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("/member/signup");
		return mv;
	}
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv, MemberVO user) {
		System.out.println(user);
		boolean isSignup = memberService.singup(user);
		if(isSignup) {
			mv.setViewName("redirect:/");
		}else {
			mv.setViewName("redirect:/signup");
		}
		mv.setViewName("redirect:/");
		return mv;
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/member/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO user) {
		System.out.println("/login:post :" + user);
		MemberVO loginUser = memberService.login(user);
		mv.addObject("user",loginUser);
		if(loginUser == null) {
			mv.setViewName("redirect:/login");
		}else {
			mv.setViewName("redirect:/");
		}
		System.out.println(loginUser);
		return mv;
	}
	@RequestMapping(value="/logout")
    public ModelAndView logout(ModelAndView mv, HttpServletRequest request) {
		request.getSession().removeAttribute("user");
        mv.setViewName("redirect/");
        return mv;
    }
}
