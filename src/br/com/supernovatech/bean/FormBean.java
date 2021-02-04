package br.com.supernovatech.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import br.com.supernovatech.model.Produto;
/**
 * @author William Derek Dias
 *
 */

@Named("form")
@SessionScoped
public class FormBean implements Serializable {
	
	private Produto produto = null;
	private List<Produto> listaProduto = new ArrayList<Produto>();
	
	@PostConstruct
	public void iniciar() {
		if (produto == null)
			produto = new Produto();
	}
	
	/**
	 * Evento decorrente do clique do botão "Adicionar" no formulário, que inclui produto na lista
	 * @param evento
	 */
	public void Adicionar(ActionEvent evento) {		
		listaProduto.add(produto);
		produto = new Produto();
	}
	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


}
