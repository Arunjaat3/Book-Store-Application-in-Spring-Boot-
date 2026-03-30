package com.bookstore.bookstoreapplication.config;
import org.springframework.context.annotation.Profile; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Bean; 

@Configuration
public class DataSourceConfig {
	@Bean
     @Profile("dev")
	public String devDataSource() {
		return "Connted to Dev DB";
	}
	
	  @Bean
		@Profile("stage")
		public String stageDataSource() {
			return "Connected to Stage DB"; 
		} 
	
     @Bean
	@Profile("prod")
	public String prodDataSource() {
		return "Connected to PROD DB"; 
	}
	
}
