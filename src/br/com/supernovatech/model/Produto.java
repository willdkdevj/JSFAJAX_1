package br.com.supernovatech.model;

public class Produto {

	private String nome;
	private Integer quantidade;
	private Boolean marcar;
		
	public Produto() {
		super();
	}

	public Produto(String nome, Integer quantidade, Boolean marcar) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.marcar = marcar;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Boolean getMarcar() {
		return marcar;
	}
	public void setMarcar(Boolean marcar) {
		this.marcar = marcar;
	}
	
	
}
