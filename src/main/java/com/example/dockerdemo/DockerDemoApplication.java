package com.example.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

	@GetMapping
	public String testResult(){
		return "Hello World";
	}

}
