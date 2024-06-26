package com.demo.error;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/error/{value}")
	public ResponseEntity<String> errorToggler(@PathVariable Long value) {
		return value == 1 ? ResponseEntity.ok("Ok Response") : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
