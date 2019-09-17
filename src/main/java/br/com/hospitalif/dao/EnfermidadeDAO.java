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

import br.com.hospitalif.model.Enfermidade;

/**
 * @author Daniel
 *
 */
public class EnfermidadeDAO {
	
	static final Logger logger = LogManager.getLogger(EnfermidadeDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public EnfermidadeDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Enfermidade enfe) {
		logger.info("Adicionando Enfermidade ao BD");
		try {
			em.getTransaction().begin();
			em.persist(enfe);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Enfermidade" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<Enfermidade> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Enfermidade.class.getName()).getResultList(); }
	 * 
	 */

}
