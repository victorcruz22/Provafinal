package br.com.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Produto {
@javax.persistence.Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String nomeProdut;
	private double preco;
	private int quantidade;
	private String descricao;
	private String urlImagem;
	public String getNomeProdut() {
		return nomeProdut;
	}
	public void setNomeProdut(String nomeProdut) {
		this.nomeProdut = nomeProdut;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
}
