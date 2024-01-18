package com.searchapp.controller;

import org.springframework.stereotype.Controller;
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
	public String handle(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "success";
	}

}
