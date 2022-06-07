package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class CodigoArea extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = 7902781070394493011L;

	private String estado;
	private String codigo;

	public String getDescricao() {
		return codigo;
	}

	public void setDescricao(String codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
