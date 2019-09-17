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

import br.com.hospitalif.model.Pessoa;

/**
 * @author Daniel
 *
 */
public class PessoaDAO {
	
	static final Logger logger = LogManager.getLogger(PessoaDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public PessoaDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Pessoa pe) {
		logger.info("Adicionando Pessoa ao BD");
		try {
			em.getTransaction().begin();
			em.persist(pe);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Pessoa" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<Pessoa> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Pessoa.class.getName()).getResultList(); }
	 * 
	 */

}
