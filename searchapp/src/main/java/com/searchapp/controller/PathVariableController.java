package com.searchapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class PathVariableController {

	@RequestMapping("/user/{userid}/{name}")
	public String gerUserDetails(@PathVariable("userid") int userid, @PathVariable("name") String name) {
		System.out.println(userid);
		System.out.println(name);
		Integer.parseInt(name);
//		String s = null;
//		System.out.println(s.charAt(0));
		return "home";
	}
	
//	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
//	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//	public String exceptionHandlerNull(Model model) {
//		model.addAttribute("exception", "exception has occurred");
//		return "nullpage";
//	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model model) {
		model.addAttribute("exception", "Null pointer exception has occurred");
		return "nullpage";
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumber(Model model) {
		model.addAttribute("exception", "Number format exception has occurred");
		return "nullpage";
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Model model) {
		model.addAttribute("exception", "Exception has occurred");
		return "nullpage";
	}
	
}
