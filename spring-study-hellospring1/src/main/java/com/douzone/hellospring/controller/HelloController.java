package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * requestMapping : class
 */

@Controller
public class HelloController {
	
	@RequestMapping("/hello") // 특정 url을 매핑한다.
	public String hello() {
		return "/WEB-INF/views/hello.jsp";	
	}
}
