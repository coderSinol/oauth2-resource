package com.sinol.oauth.resource.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sinol")
public class OauthResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthResourceApplication.class, args);
	}

}

