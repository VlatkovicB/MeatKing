package com.vlatkovic.meatking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}

	@RequestMapping("/food")
	public String foodMenu() {
		return "food";
	}

	@RequestMapping("/reservation")
	public String reservation() {
		return "reservation";
	}

	@RequestMapping("/chefs")
	public String chefs() {
		return "chefs";
	}

	@RequestMapping("/specials")
	public String specials() {
		return "specials";
	}

	@RequestMapping("/facts")
	public String facts() {
		return "facts";
	}
}
