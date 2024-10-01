package com.hk.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/home.do",method = RequestMethod.GET)
	public String home() {
		System.out.println("HOME페이지 요청");
		return "home";		//ViewResolver객체가 "WEB-INF/views" + home.jsp +".jsp"를 찾아줌
	}
}
