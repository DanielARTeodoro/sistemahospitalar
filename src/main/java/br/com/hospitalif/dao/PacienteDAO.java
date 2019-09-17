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

import br.com.hospitalif.model.Paciente;

/**
 * @author Daniel
 *
 */
public class PacienteDAO {
	
	static final Logger logger = LogManager.getLogger(PacienteDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public PacienteDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Paciente pa) {
		logger.info("Adicionando Paciente ao BD");
		try {
			em.getTransaction().begin();
			em.persist(pa);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Paciente" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public List<Paciente> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Paciente.class.getName()).getResultList(); }
	 * 
	 */

}
