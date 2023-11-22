package com.facebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	  @GetMapping("/india")
	  public String sayHello() {
		  return "home";
	  }
}
