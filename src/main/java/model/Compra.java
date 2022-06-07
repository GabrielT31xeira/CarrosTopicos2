package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Compra extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = -5956633793736643436L;

	private String valor_venda;
	private StatusCompra status;
	@OneToOne
	private Cartao cartao;
	@OneToOne
	private Pix pix;
	@ManyToOne
	private Usuario usu;

	public Usuario getUsu() {
		return usu;
	}
	public void setUsu(Usuario usu) {
		this.usu = usu;
	}
	public String getValor_venda() {
		return valor_venda;
	}
	public void setValor_venda(String valor_venda) {
		this.valor_venda = valor_venda;
	}
	public StatusCompra getStatus() {
		return status;
	}
	public void setStatus(StatusCompra status) {
		this.status = status;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	public Pix getPix() {
		return pix;
	}
	public void setPix(Pix pix) {
		this.pix = pix;
	}


}
