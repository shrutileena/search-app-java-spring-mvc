package com.searchapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.searchapp.entity.Student;

@Controller
public class ComplexFormController {

	@RequestMapping("/complex")
	public String showForm() {
		return "complexform";
	}

	@RequestMapping(path = "/handle", method = RequestMethod.POST)
	public String handle(@ModelAttribute("student") Student student, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			// if error occurs then it will open complexform again plus the error meg in the view
			return "complexform";
		} else {
			System.out.println(student);
			System.out.println(student.getAddress().getStreet());
			System.out.println(student.getAddress().getCity());
			return "success";
		}
		
	}

}
