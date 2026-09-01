package com.delegrego.spring_devs2blu_2026.dto;

public class HelloWorldRequisicao {

	private String nome;

	private int idade;

	public HelloWorldRequisicao(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
