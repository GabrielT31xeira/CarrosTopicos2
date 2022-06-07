package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Pix extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = 7210407535257247636L;

	private String exemplo;

	public String getExemplo() {
		return exemplo;
	}

	public void setExemplo(String exemplo) {
		this.exemplo = exemplo;
	}
}
