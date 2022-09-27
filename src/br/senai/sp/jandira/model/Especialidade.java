package br.senai.sp.jandira.model;

public class Especialidade {
	private String nome;
	private String descricao;
	private static int quantidade;

	// Métodos de acesso getters and setters
	// sempre será void.
	
	public Especialidade() {
		quantidade++;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
	
//	public static void setQuantidade() {
//		quantidade++;
//	}
}
