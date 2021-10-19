package com.example.actuatorservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ActuatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorServiceApplication.class, args);
	}
	@RestController
	public class Controller{
		@GetMapping(value="/hello")
		public String hello() {
			return "HELLO WORLD!";
		}
	}
	
	
	}


