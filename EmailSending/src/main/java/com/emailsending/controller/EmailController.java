package com.emailsending.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "hello this is email api";
	}
}
