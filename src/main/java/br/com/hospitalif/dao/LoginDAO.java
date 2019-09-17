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

import br.com.hospitalif.model.Login;

/**
 * @author Daniel
 *
 */
public class LoginDAO {

	static final Logger logger = LogManager.getLogger(LoginDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public LoginDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	public void inserir(Login lo) {
		logger.info("Adicionando Login ao BD");
		try {
			em.getTransaction().begin();
			em.persist(lo);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Erro ao inserir Login" + e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.clear();
			em.close();
		}

	}

	/*
	 * 
	 * public void remover(Login lo) {
	 * 
	 * logger.info("Removeido o Login do BD"); try { em.getTransaction().begin();
	 * em.remove(lo); em.getTransaction().commit(); } catch (Exception e) { // TODO:
	 * handle exception logger.error("Erro ao remover o Login" + e.getMessage());
	 * em.getTransaction().rollback(); } finally { em.clear(); em.close();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void alterar(Login lo) {
	 * 
	 * logger.info("alterado o Login do BD"); try { em.getTransaction().begin();
	 * em.merge(lo); em.getTransaction().commit(); } catch (Exception e) { // TODO:
	 * handle exception logger.error("Erro ao alterar o Login" + e.getMessage());
	 * em.getTransaction().rollback(); } finally { em.clear(); em.close();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void consultarNome() {}
	 * 
	 * public void consultarTodos() {}
	 * 
	 */

	/*
	 * 
	 * public List<Login> consultarTodos() {
	 * 
	 * return em.createQuery("FROM " + Login.class.getName()).getResultList(); }
	 * 
	 */

}
