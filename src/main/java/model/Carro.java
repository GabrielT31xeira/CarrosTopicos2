package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Carro extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = -8294173180190622560L;

	private String titulo;
	private String anos_uso;
	private String cor;
	private String valor;
	private String num_serie;
	private String ano_fablicacao;
	private String final_placa;
	private String km_rodados;
	private Boolean automatico;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Modelo modelo;

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Boolean getAutomatico() {
		return automatico;
	}
	public void setAutomatico(Boolean automatico) {
		this.automatico = automatico;
	}
	public String getNum_serie() {
		return num_serie;
	}
	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}
	public String getAno_fablicacao() {
		return ano_fablicacao;
	}
	public void setAno_fablicacao(String ano_fablicacao) {
		this.ano_fablicacao = ano_fablicacao;
	}
	public String getFinal_placa() {
		return final_placa;
	}
	public void setFinal_placa(String final_placa) {
		this.final_placa = final_placa;
	}
	public String getKm_rodados() {
		return km_rodados;
	}
	public void setKm_rodados(String km_rodados) {
		this.km_rodados = km_rodados;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAnos_uso() {
		return anos_uso;
	}
	public void setAnos_uso(String anos_uso) {
		this.anos_uso = anos_uso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

}
