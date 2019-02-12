package com.sinol.oauth.resource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("public")
public class PublicController {

	@RequestMapping("/welcome")
	public @ResponseBody String getGreeting() {
		return "Hey Good Day!";
	}

}