package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Modelo extends DefaultEntity implements Serializable{
/**
	 *
	 */
	private static final long serialVersionUID = -3632928702026880978L;

	private String nome;
	@ManyToOne
	private Marca marca;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
