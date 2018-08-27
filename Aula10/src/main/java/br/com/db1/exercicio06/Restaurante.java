package br.com.db1.exercicio06;

import java.util.Date;
import java.util.List;

import br.com.db1.exercicio04.Telefone;

public class Restaurante {

	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	private List<Telefone> telefones;
	private List<Pedido> pedidos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
	}

	public List<Telefone> getTelefone() {
		return telefones;
	}
	
	public void addTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}
	
	public List<Pedido> getPedido() {
		return pedidos;
	}
	
	public void addPedido(Pedido pedidos) {
		this.pedidos.add(pedidos);
	}
}
