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
public class GerenteDAO {

	static final Logger logger = LogManager.getLogger(GerenteDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public GerenteDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Gerente g) {
		logger.info("Adicionando Gerente ao BD");
		try {
			em.getTransaction().begin();
			em.persist(g);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Gerente" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}
	}

	/*
	 * 
	 * public List<Gerente> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Gerente.class.getName()).getResultList(); }
	 * 
	 */

}
