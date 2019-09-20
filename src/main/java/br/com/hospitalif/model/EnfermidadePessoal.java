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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author Daniel
 *
 */

@Entity
@Table(name = "tb_enfermidadePessoal")

public class EnfermidadePessoal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEnfermidadePessoal")
	private int idEnfermidadePessoal;
	@Column(name = "comentario")
	private String comentario;
	@Column(name = "statusDeEnfermidade")
	private String statusDeEnfermidade;
	@OneToOne
	@JoinColumn(name = "fk_idEnfermidade")
	private Enfermidade enfermidade;
	@ManyToOne
	@JoinColumn(name = "fk_idPaciente", insertable = false, updatable = false)
	private Paciente paciente;
	@ManyToOne
	@JoinColumn(name = "fk_idAtendimento", insertable = false, updatable = false)
	private Atendimento atendimento;

	/**
	 * 
	 */
	public EnfermidadePessoal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idEnfermidadePessoal
	 */
	public int getIdEnfermidadePessoal() {
		return idEnfermidadePessoal;
	}

	/**
	 * @param idEnfermidadePessoal the idEnfermidadePessoal to set
	 */
	public void setIdEnfermidadePessoal(int idEnfermidadePessoal) {
		this.idEnfermidadePessoal = idEnfermidadePessoal;
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
	 * @return the statusDeEnfermidade
	 */
	public String getStatusDeEnfermidade() {
		return statusDeEnfermidade;
	}

	/**
	 * @param statusDeEnfermidade the statusDeEnfermidade to set
	 */
	public void setStatusDeEnfermidade(String statusDeEnfermidade) {
		this.statusDeEnfermidade = statusDeEnfermidade;
	}

	/**
	 * @return the enfermidade
	 */
	public Enfermidade getEnfermidade() {
		return enfermidade;
	}

	/**
	 * @param enfermidade the enfermidade to set
	 */
	public void setEnfermidade(Enfermidade enfermidade) {
		this.enfermidade = enfermidade;
	}

	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * @return the atendimento
	 */
	public Atendimento getAtendimento() {
		return atendimento;
	}

	/**
	 * @param atendimento the atendimento to set
	 */
	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

}
