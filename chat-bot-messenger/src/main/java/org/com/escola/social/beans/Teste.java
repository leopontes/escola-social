package org.com.escola.social.beans;

import java.io.Serializable;

public class Teste implements Serializable{

	private static final long serialVersionUID = 4600833669648372387L;

	private String nome;
	
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

