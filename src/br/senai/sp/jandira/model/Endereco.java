package br.senai.sp.jandira.model;

public class Endereco {

	private String logradouro;
	private String cidade;
	private String bairro;
	private String cep;
	private String pontoReferencia;
	private String numero;
	private String tipo;
	private Estados estado;
	private String complemento;

	// Metodos de acesso

	public void setLogradouro(String Logradouro) {
		this.logradouro = Logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setCidade(String Cidade) {
		this.cidade = Cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setBairro(String Bairro) {
		this.bairro = Bairro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCep() {
		return cep;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	
	public Estados getEstado() {
		return estado;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getComplemento() {
		return complemento;
	}

}
