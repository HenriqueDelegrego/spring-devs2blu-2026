package com.delegrego.spring_devs2blu_2026.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delegrego.spring_devs2blu_2026.dto.HelloWorldRequisicao;
import com.delegrego.spring_devs2blu_2026.dto.HelloWorldResposta;
import com.delegrego.spring_devs2blu_2026.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	HelloWorldService servico;

	@PostMapping("/hello")
	public HelloWorldResposta helloWorld(@RequestBody HelloWorldRequisicao requisicao) {
		return servico.helloWorld(requisicao);
	}

	@GetMapping("/tchau")
	public String tchau() {
		return "Tchau";
	}

}