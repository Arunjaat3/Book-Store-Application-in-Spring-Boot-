package com.bookstore.bookstoreapplication.controller;
import org.springframework.beans.factory.annotation.*;  
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class ProfileController {
	
	private final String dataSource; 
	public ProfileController(@Qualifier("devDataSource") String dataSource) {
		this.dataSource = dataSource; 
	}
	
	
	@GetMapping("/profile")
	public String showActiveProfile() {
		return "Current Active Profile: "+dataSource;	
				
	}

	
	 
}
