package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Acessorio extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = 8557658306163698067L;

	@ManyToOne
	private Carro carro;

	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
