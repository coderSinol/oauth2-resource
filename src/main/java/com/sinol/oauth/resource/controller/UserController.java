package com.sinol.oauth.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("oauth2")
public class UserController {

	@RequestMapping("/secured")
	@PreAuthorize("#oauth2.hasAnyScope('read')")
	public @ResponseBody String getRandomMessage(OAuth2Authentication auth) {
		return "Access granted for " + auth.getPrincipal();
	}
	
}
