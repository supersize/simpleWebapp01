package com.SpringTest03.web.htmlController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;

public class MainHtmlController {

	@GetMapping("/")
	public String goHome (HttpServletRequest request, HttpServletResponse response) {
		return "/";
	}
}
