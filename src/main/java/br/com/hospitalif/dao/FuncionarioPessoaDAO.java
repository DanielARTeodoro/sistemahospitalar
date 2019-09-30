/**
 * 
 */
package br.com.hospitalif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Daniel
 *
 */
public class FuncionarioPessoaDAO {

	
	static final Logger logger = LogManager.getLogger(FuncionarioPessoaDAO.class.getName());
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdPU");
	protected EntityManager em = null;

	public FuncionarioPessoaDAO() {
		super();
		if (em == null) {
			em = emf.createEntityManager();
		}

	}

	

}
