package com.delegrego.spring_devs2blu_2026.dto;

public class HelloWorldResposta {

	private String mensagem;

	private String nome;

	private int idade;

	public HelloWorldResposta(String mensagem, String nome, int idade) {
		this.mensagem = mensagem;
		this.nome = nome;
		this.idade = idade;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
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
