package br.com.db1.exercicio07;

public class Olimpiada {

	private Integer ano;
	private Sede sede;
	private Pessoa pessoa;
	private Modalidade modalidade;
	

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public Olimpiada(Pessoa pessoaParametro, Modalidade modalidadeParametro, Sede sedeParametro ) {
		this.pessoa = pessoaParametro;
		this.modalidade = modalidadeParametro;
		this.sede = sedeParametro;
	}
}
