package com.searchapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	@RequestMapping("/user/{userid}/{name}")
	public String gerUserDetails(@PathVariable("userid") int userid, @PathVariable("name") String name) {
		System.out.println(userid);
		System.out.println(name);
		return "home";
	}
	
}
