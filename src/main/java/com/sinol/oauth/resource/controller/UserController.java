package com.sinol.oauth.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("/profile")
	@PreAuthorize("#oauth2.hasAnyScope('read')")
	public @ResponseBody String getRandomMessage() {
		return "Sinol user";
	}
	
}
