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

import br.com.hospitalif.model.Entrada;
import br.com.hospitalif.model.Login;

/**
 * @author Daniel
 *
 */
public class EntradaDAO {

	static final Logger logger = LogManager.getLogger(EntradaDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public EntradaDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Entrada en) {
		logger.info("Adicionando Entrada ao BD");
		try {
			em.getTransaction().begin();
			em.persist(en);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Entrada" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<Entrada> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Entrada.class.getName()).getResultList(); }
	 * 
	 */

}
