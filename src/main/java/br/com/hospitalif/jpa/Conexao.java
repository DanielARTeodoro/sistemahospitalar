/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospitalif.jpa;

import java.sql.Connection;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 * 
 */

public class Conexao {

	static Connection conn = null;
	EntityManagerFactory emf = null;

	public Conexao() {

		if (emf == null) {
			emf = createEntity();
		} else {
			getEntity();
		}
	}

	public EntityManagerFactory createEntity() {
		emf = Persistence.createEntityManagerFactory("bdPU");
		return emf;
	}

	public void closeEMF() {
		emf.close();
	}

	private EntityManagerFactory getEntity() {
		return emf;
	}

}
