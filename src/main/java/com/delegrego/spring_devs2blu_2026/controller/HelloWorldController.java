package com.delegrego.spring_devs2blu_2026.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController indica que esta classe é um Controller REST.
 *
 * Um Controller é responsável por receber as requisições HTTP
 * que chegam à nossa aplicação e decidir o que deve ser retornado.
 *
 * Por exemplo:
 *   GET http://localhost:8080/hello/Joao/25
 *
 * Essa requisição pode ser atendida por um método desta classe.
 */
@RestController
public class HelloWorldController {

	/*
	 * @GetMapping indica que este método será executado quando recebermos uma
	 * requisição HTTP do tipo GET para este endereço:
	 *
	 * /hello/{nome}/{idade}
	 *
	 * As partes entre { } são variáveis da URL.
	 *
	 * Por exemplo, se acessarmos:
	 *
	 * /hello/Maria/30
	 *
	 * teremos: nome = "Maria" idade = 30
	 *
	 * O Spring pega esses valores da URL e coloca nos parâmetros do método através
	 * da anotação @PathVariable.
	 */
	@GetMapping("/hello/{nome}/{idade}")
	public String helloWorld(@PathVariable String nome, @PathVariable int idade) {

		/*
		 * O valor retornado pelo método será enviado como resposta para quem fez a
		 * requisição HTTP.
		 *
		 * Neste caso, a resposta será um texto (String).
		 *
		 * Exemplo: GET /hello/Maria/30
		 *
		 * Resposta: Hello, Maria, você tem 30 anos
		 */
		return "Hello, " + nome + ", você tem " + idade + " anos";
	}

	/*
	 * Outro endpoint da nossa API.
	 *
	 * @GetMapping("/tchau") significa:
	 *
	 * Quando alguém fizer um GET para /tchau, execute o método tchau().
	 *
	 * Exemplo:
	 *
	 * GET http://localhost:8080/tchau
	 */
	@GetMapping("/tchau")
	public String tchau() {

		// O texto retornado será enviado como resposta HTTP.
		return "Tchau";
	}

}