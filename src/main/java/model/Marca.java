package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Marca extends DefaultEntity implements Serializable{

	private static final long serialVersionUID = -3087305037370647166L;

	private String nome;

	public String getDescricao() {
		return nome;
	}

	public void setDescricao(String nome) {
		this.nome = nome;
	}

}
