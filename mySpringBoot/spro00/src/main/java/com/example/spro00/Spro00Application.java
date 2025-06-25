package com.example.spro00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Spro00Application {

	public static void main(String[] args) {
		SpringApplication.run(Spro00Application.class, args);
	}
	@GetMapping
	public String helloWorld(){
		return "Hello World!!!";
	}
}
