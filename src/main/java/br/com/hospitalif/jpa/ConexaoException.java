/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospitalif.jpa;

/**
 *
 * @author Daniel
 * 
 */
@SuppressWarnings("serial")
public class ConexaoException extends Exception {

	public void JPAException(String ex) {
		System.out.printf("Erro na conexão: \n" + ex);
	}
}
