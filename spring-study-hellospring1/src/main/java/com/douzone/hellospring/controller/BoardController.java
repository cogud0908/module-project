package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {

	@ResponseBody
	@RequestMapping("/write")
	// requestParameter 이름이 name인 값을 매개변수로 넣어라
	public String write(
			@RequestParam("e") String email,
			@RequestParam(value="name", required=false) String name,
			@RequestParam String password,
	/*추천*/	@RequestParam(value="content", required=true, defaultValue="") String content) {
		System.out.println("name:"+name);
		System.out.println("password:"+password);
		System.out.println("content:"+content);
		System.out.println("email:"+email);
		return "BoardController:write()";
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	// requestParameter 이름이 no인 값을 매개변수로 넣어라
	public String delete(@RequestParam(value="no", required=false) Long no) {
		return "BoardController:delete() : "+no;
	}

	@ResponseBody
	@RequestMapping("/view")
	public String view(@RequestParam(value="no", required=true, defaultValue="20131917") Long no) {
		return "BoardController:view() : "+no;
	}
	
	@ResponseBody
	@RequestMapping("/view2/{id}/{no}")
	public String view2(
			@PathVariable("id") String id,
			@PathVariable("no") Long no) {
		return "BoardController:view() : "+id+":"+no;
	}
}
