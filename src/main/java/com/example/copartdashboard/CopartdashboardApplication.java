package com.example.copartdashboard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@SpringBootApplication
public class CopartdashboardApplication {
	
	@Value("${message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(CopartdashboardApplication.class, args);
	}
	
	
	@RequestMapping("/dashboardmsg")
	public String display() {
		return message;
	}
	
	
}
