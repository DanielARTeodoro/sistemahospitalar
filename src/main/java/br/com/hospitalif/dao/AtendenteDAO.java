/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Daniel
 *
 */
public class AtendenteDAO {

	static final Logger logger = LogManager.getLogger(AtendenteDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public AtendenteDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	/*
	 * 
	 * public List<Atendente> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Atendente.class.getName()).getResultList(); }
	 * 
	 */

}
