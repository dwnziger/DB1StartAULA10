package br.com.db1.exercicio06;

public class Endereco {

	private String logradouro;
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String exibirCepFormatado() {
		return "CEP";
	}
	
}
