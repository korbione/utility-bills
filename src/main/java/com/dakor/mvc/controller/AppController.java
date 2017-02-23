package com.dakor.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * .
 *
 * @author dkor
 */
@Controller
@RequestMapping("app")
public class AppController {

	@GetMapping
	public String app() {
		return "app";
	}
}
