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

import br.com.hospitalif.model.Atendimento;

/**
 * @author Daniel
 *
 */
public class AtendimentoDAO {
	
	static final Logger logger = LogManager.getLogger(AtendimentoDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public AtendimentoDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Atendimento at) {
		logger.info("Adicionando Atendimento ao BD");
		try {
			em.getTransaction().begin();
			em.persist(at);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Atendimento" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<Atendimento> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Atendimento.class.getName()).getResultList(); }
	 * 
	 */
}
