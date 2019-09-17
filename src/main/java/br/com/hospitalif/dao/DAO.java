/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospitalif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Daniel
 *
 */
public class DAO {

	private EntityManager em = null;

	public DAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
		if (em == null) {
			em = emf.createEntityManager();
		}
	}

	public EntityManager getEntity() {
		return em;
	}

}
