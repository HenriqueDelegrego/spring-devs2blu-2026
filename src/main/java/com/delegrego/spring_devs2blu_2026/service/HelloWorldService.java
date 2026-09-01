package com.delegrego.spring_devs2blu_2026.service;

import org.springframework.stereotype.Service;

import com.delegrego.spring_devs2blu_2026.dto.HelloWorldRequisicao;
import com.delegrego.spring_devs2blu_2026.dto.HelloWorldResposta;

@Service
public class HelloWorldService {

	public HelloWorldResposta helloWorld(HelloWorldRequisicao requisicao) {
		return new HelloWorldResposta
				("Hello, essas são suas informações",
						requisicao.getNome(),
						requisicao.getIdade());
	}

}
