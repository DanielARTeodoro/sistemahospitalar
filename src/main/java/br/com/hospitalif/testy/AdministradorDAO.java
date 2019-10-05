/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.testy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Daniel
 *
 */
public class AdministradorDAO {

	static final Logger logger = LogManager.getLogger(AdministradorDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public AdministradorDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}
	
	/*
	 * 
	 * public List<Administrador> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Administrador.class.getName()).getResultList(); }
	 * 
	 */
	
	

}
