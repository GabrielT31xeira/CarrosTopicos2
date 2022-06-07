package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Cartao extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = -6720392021637911668L;

	private String exemplo;

	public String getExemplo() {
		return exemplo;
	}

	public void setExemplo(String exemplo) {
		this.exemplo = exemplo;
	}

}
