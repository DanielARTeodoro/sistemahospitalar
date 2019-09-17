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

import br.com.hospitalif.model.EnfermidadePessoal;

/**
 * @author Daniel
 *
 */
public class EnfermidadePessoalDAO {

	static final Logger logger = LogManager.getLogger(EnfermidadePessoalDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public EnfermidadePessoalDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(EnfermidadePessoal enfep) {
		logger.info("Adicionando EnfermidadePessoal ao BD");
		try {
			em.getTransaction().begin();
			em.persist(enfep);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir EnfermidadePessoal" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<EnfermidadePessoal> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + EnfermidadePessoal.class.getName()).getResultList(); }
	 * 
	 */
	
}
