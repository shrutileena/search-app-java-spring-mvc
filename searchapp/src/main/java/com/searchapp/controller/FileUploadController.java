package com.searchapp.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileupload")
	public String fileUpload() {
		return "fileupload";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String imageUpload(@RequestParam("profile") CommonsMultipartFile commonsMultipartFile, Model model,
			HttpSession s) throws IOException {
		System.out.println("image upload handler");
		System.out.println(commonsMultipartFile.getSize());
		System.out.println(commonsMultipartFile.getName());
		System.out.println(commonsMultipartFile.getOriginalFilename());
		System.out.println(commonsMultipartFile.getContentType());
		System.out.println(commonsMultipartFile.getStorageDescription());
		System.out.println(commonsMultipartFile.getFileItem());

		// saving file in some folder
		byte[] data = commonsMultipartFile.getBytes();
		// we have to save this file to server
		String path = "D:\\Eclipse\\workspace\\searchapp\\src\\main\\webapp\\WEB-INF\\resources\\uploadedimage\\"
				+ commonsMultipartFile.getOriginalFilename();
//		path = s.getServletContext().getRealPath("/") + "\\WEB-INF\\resources\\uploadedimage\\"
//				+ commonsMultipartFile.getOriginalFilename();
		System.out.println(path);

		FileOutputStream f = new FileOutputStream(path);
		f.write(data);

		f.close();

		// adding message and filename in model
		model.addAttribute("msg", "image file is uploaded");
		model.addAttribute("filename", commonsMultipartFile.getOriginalFilename());
		return "filesuccess";
//		return "redirect:/filesuccess";
//		return "fileupload";
	}

//	@RequestMapping("/filesuccess")
//	public String fileSuccess(Model model) {
//		model.addAttribute("msg", "image file is uploaded");
//		return "fileupload";
//	}

}
