package com.bookstore.bookstoreapplication.config;

import org.springframework.context.annotation.*;

import org.springframework.context.annotation.Bean; 
@Configuration
public class AppConfig {

	@Bean
	public String welcomeUser() {
		return "HELLO WELCOME TO BOOKSTORE";
	}
}
