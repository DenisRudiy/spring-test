package com.test.springtestapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTestApp01Application {

	@GetMapping("/message")
	public String message(){
		return "Hello World! Your app is on Azure now! :D";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApp01Application.class, args);
	}

}
