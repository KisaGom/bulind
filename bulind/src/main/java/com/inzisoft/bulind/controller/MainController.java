package com.inzisoft.bulind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("/index")
	public String toIndex() {
		return "index";
	}
	
	@RequestMapping("/board")
	public String toBoard() {
		return "board";
	}
}
