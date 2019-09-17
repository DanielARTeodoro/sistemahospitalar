/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospitalif.controller;

import br.com.hospitalif.jpa.Conexao;

/**
 *
 * @author Daniel
 */
public class Autenticar {

	public String logar(String user, String pass) {

		// lógica de negócio para autenticação

		return "Usuário ou senha incorretos!";
	}

	// -------------------------------------------------------------------------
	public void logout() {
		Conexao conn = new Conexao();
		conn.closeEMF();
		// destruir sessão

		// redirecionar view
		// web vamos chamar jsf

		// javaFX: chamar fxml

		// mobile: chamar java
	}
	// -------------------------------------------------------------------------
}
