/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.model;

/**
 * @author Daniel
 *
 */
public class Login {

	private String login;
	private String senha;
	private String statusDeUsuario;

	/**
	 * 
	 */
	public Login() {
		// TODO Auto-generated constructor stub
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

}
