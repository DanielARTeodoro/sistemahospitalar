/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.testy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
//@PrimaryKeyJoinColumn(name = "idFuncionario")
@Table(name = "tb_enfermeiro")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Enfermeiro extends Funcionario {

	/// @Id
	/// @GeneratedValue
	// @Column

	/// @Column(name = "id")

	/// private Integer id;

	@Column(name = "numeroDeRegistro")
	private int numeroDeRegistro;

	/**
	 * 
	 */
	public Enfermeiro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroDeRegistro
	 */
	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	/**
	 * @param numeroDeRegistro the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(int numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

}
