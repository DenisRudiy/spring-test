package com.test.springtestapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringTestApp01Application {

	@GetMapping("/messages")
	public String message(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApp01Application.class, args);
	}

}
