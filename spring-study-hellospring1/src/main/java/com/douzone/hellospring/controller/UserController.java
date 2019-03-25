package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
 * request Mapping : type + method
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.POST)
	// modelAttribute 값있는지 없는지 검사
	public String join(@ModelAttribute UserVo uservo) {
		System.out.println(uservo);
		return "Usercontroller:join()";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String login() {
		return "Usercontroller:login()";
	}
	
	@ResponseBody
	@RequestMapping("/loginform")
	public String loginform() {
		return "Usercontroller:loginform()";
	}
}
