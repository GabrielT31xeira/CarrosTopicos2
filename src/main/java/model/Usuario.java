package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Usuario extends DefaultEntity implements Serializable{

	private static final long serialVersionUID = -2828223166739295713L;
	@Column(length = 60)
	private String nome;
	@Column(length = 60)
	private String email;
	@Column(length = 30)
	private String senha;
	private String data_nasc;

	@OneToOne
	private PessoaFisica pessoa_f;
	@OneToOne
	private PessoaJuridica pessoa_j;

	private Sexo sexo;
	private Funcao funcao;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public PessoaFisica getPessoa_f() {
		return pessoa_f;
	}
	public void setPessoa_f(PessoaFisica pessoa_f) {
		this.pessoa_f = pessoa_f;
	}
	public PessoaJuridica getPessoa_j() {
		return pessoa_j;
	}
	public void setPessoa_j(PessoaJuridica pessoa_j) {
		this.pessoa_j = pessoa_j;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

}
