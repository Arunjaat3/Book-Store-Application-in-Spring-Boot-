package com.bookstore.bookstoreapplication.service;
import org.springframework.stereotype.*; 
import org.springframework.scheduling.annotation.Async;   
@Component
public class EmailService {
	@Async 
	 public void sendEmail(String bookName) {
		 System.out.println("Order conform"+bookName); 
	 }

} 
 