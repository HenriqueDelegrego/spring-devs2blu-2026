package com.delegrego.spring_devs2blu_2026.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello/{nome}/{idade}")
	public String helloWorld(@PathVariable String nome, @PathVariable int idade) {
		return "Hello, " + nome + ", você tem " + idade + " anos";
	}

	@GetMapping("/tchau")
	public String tchau() {
		return "Tchau";
	}

}
