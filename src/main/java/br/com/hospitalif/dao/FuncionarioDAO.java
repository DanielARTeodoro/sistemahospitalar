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

import br.com.hospitalif.model.Funcionario;

/**
 * @author Daniel
 *
 */
public class FuncionarioDAO {
	
	static final Logger logger = LogManager.getLogger(FuncionarioDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public FuncionarioDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Funcionario fu) {
		logger.info("Adicionando Funcionario ao BD");
		try {
			em.getTransaction().begin();
			em.persist(fu);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Funcionario" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<Funcionario> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Funcionario.class.getName()).getResultList(); }
	 * 
	 */

}
