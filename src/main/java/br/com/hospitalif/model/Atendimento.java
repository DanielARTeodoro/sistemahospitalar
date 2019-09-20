/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package br.com.hospitalif.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
@Table(name = "tb_atendimento")

public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/// @Column(name = "idAtendimento")

	@Column(name = "idAtendimento")
	private int idAtendimento;
	@Column(name = "comentarioEnfermeiro")
	private String comentarioEnfermeiro;
	@Column(name = "comentarioMedico")
	private String comentarioMedico;
	@Column(name = "peso")
	private float peso;
	@Column(name = "altura")
	private float altura;
	@Column(name = "data")
	private Date data;

	@OneToOne
	@JoinColumn(name = "fk_idEnfermeiro")
	private Enfermeiro enfermeiro;

	@OneToOne
	@JoinColumn(name = "fk_idMedico")
	private Medico medico;

	@ManyToOne
	@JoinColumn(name = "fk_idEntrada", insertable = false, updatable = false)
	private Entrada entrada;

	@OneToMany
	@JoinColumn(name = "fk_idEnfermidadePessoal")
	private List<EnfermidadePessoal> doenca;

	/**
	 * 
	 */
	public Atendimento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idAtendimento
	 */
	public int getIdAtendimento() {
		return idAtendimento;
	}

	/**
	 * @param idAtendimento the idAtendimento to set
	 */
	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	/**
	 * @return the comentarioEnfermeiro
	 */
	public String getComentarioEnfermeiro() {
		return comentarioEnfermeiro;
	}

	/**
	 * @param comentarioEnfermeiro the comentarioEnfermeiro to set
	 */
	public void setComentarioEnfermeiro(String comentarioEnfermeiro) {
		this.comentarioEnfermeiro = comentarioEnfermeiro;
	}

	/**
	 * @return the comentarioMedico
	 */
	public String getComentarioMedico() {
		return comentarioMedico;
	}

	/**
	 * @param comentarioMedico the comentarioMedico to set
	 */
	public void setComentarioMedico(String comentarioMedico) {
		this.comentarioMedico = comentarioMedico;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the enfermeiro
	 */
	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	/**
	 * @param enfermeiro the enfermeiro to set
	 */
	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}

	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * @return the entrada
	 */
	public Entrada getEntrada() {
		return entrada;
	}

	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	/**
	 * @return the doenca
	 */
	public List<EnfermidadePessoal> getDoenca() {
		return doenca;
	}

	/**
	 * @param doenca the doenca to set
	 */
	public void setDoenca(List<EnfermidadePessoal> doenca) {
		this.doenca = doenca;
	}

}
