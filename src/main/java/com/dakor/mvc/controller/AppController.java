package com.dakor.mvc.controller;

import com.dakor.mvc.model.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * .
 *
 * @author dkor
 */
@Controller
@RequestMapping
public class AppController {

	@GetMapping("*")
	public String app(ModelAndView mav) {
		return "app";
	}

	@ModelAttribute("hello")
	public Hello createHelloModel() {
		return new Hello("dkor");
	}
}
