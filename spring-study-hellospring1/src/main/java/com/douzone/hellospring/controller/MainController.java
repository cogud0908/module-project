package com.douzone.hellospring.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@ResponseBody
	// requestMapping : 메소드에서만
	// 메소드 단독 매핑
	@RequestMapping({"","/main"})
	public String main()
	{
		return "MainControllermain()";
	}
	
	@ResponseBody
	@RequestMapping("/main2/a/b/c")
	public String main2()
	{
		return "MainController:main2()";
	}
	
	/*
	 * 비추천
	 * 기술이 침투되어 있다.
	 */
	@ResponseBody
	@RequestMapping("/main3")
	public String main3(HttpServletRequest request, Writer out)
	{
		String name = request.getParameter("n");
		return "MainController:main3()";
	}
}
