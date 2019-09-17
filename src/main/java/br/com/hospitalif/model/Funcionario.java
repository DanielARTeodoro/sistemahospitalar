/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "tb_funcionario")

public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "idFuncionario")
	private int idFuncionario;
	@Column(name = "login")
	private String login;
	@Column(name = "senha")
	private String senha;
	@Column(name = "statusDeUsuario")
	private String statusDeUsuario;
	//@OneToOne
	@JoinColumn(name = "fk_idPessoa")
	private Pessoa pessoa;

	/**
	 * 
	 */
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idFuncionario
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}

	/**
	 * @param idFuncionario the idFuncionario to set
	 */
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the statusDeUsuario
	 */
	public String getStatusDeUsuario() {
		return statusDeUsuario;
	}

	/**
	 * @param statusDeUsuario the statusDeUsuario to set
	 */
	public void setStatusDeUsuario(String statusDeUsuario) {
		this.statusDeUsuario = statusDeUsuario;
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
