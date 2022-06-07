package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Telefone extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = 7737688903896203811L;

	private String numero;
	@OneToOne
	private CodigoArea cod_area;
	@ManyToOne
	private Usuario usu;

	public CodigoArea getCod_area() {
		return cod_area;
	}
	public void setCod_area(CodigoArea cod_area) {
		this.cod_area = cod_area;
	}
	public Usuario getUsu() {
		return usu;
	}
	public void setUsu(Usuario usu) {
		this.usu = usu;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
