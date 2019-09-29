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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
//@PrimaryKeyJoinColumn(name = "idFuncionario")
@Table(name = "tb_medico")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Medico extends Funcionario {

	/// @Id
	/// @GeneratedValue
	//// @Column(name = "id")

	/// @Column
	//// private Integer id;
	@Column(name = "numeroDeRegistro")
	private int numeroDeRegistro;
	@Column(name = "especialidade")
	private String especialidade;

	/**
	 * 
	 */
	public Medico() {
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

	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
