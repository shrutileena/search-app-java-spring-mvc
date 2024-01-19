package com.searchapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping(path = {"/home"})
	public String home() {
		return "home";
	}
	
	@RequestMapping(path = "/search")  // search - name of input in home.jsp
	public RedirectView search(@RequestParam("querybox") String query, Model model, HttpServletResponse response) throws IOException {
		
		RedirectView redirectView = new RedirectView();
		
		if(query.isEmpty()) {
			model.addAttribute("msg", "Please enter your keyword");
			redirectView.setUrl("home");
			
		} else {
			String url = "https://www.google.com/search?q=" + query;
			redirectView.setUrl(url);
		}
		
		return redirectView;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	public String exceptionHandlerNull(Model model) {
		model.addAttribute("exception", "exception has occurred");
		return "nullpage";
	}
}
