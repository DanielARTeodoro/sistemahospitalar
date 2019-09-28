/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
//@PrimaryKeyJoinColumn(name = "idFuncionario")
@Table(name = "tb_gerente")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Gerente extends Funcionario {

	/// @Id
	/// @GeneratedValue
	//// @Column(name = "id")

	/// @Column
	//// private Integer id;

	@Column(name = "cargo")
	private String cargo;

	/**
	 * 
	 */
	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
