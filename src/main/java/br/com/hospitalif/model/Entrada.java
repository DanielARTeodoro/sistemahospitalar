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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Daniel
 *
 */

@Entity
@Table(name = "tb_entrada")

public class Entrada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "idEntrada")
	private int idEntrada;
	@Column(name = "dataEntrada")
	private Date dataEntrada;
	@Column(name = "dataSaida")
	private Date dataSaida;
	@Column(name = "statusEntrada")
	private String statusEntrada;
	@ManyToOne
	@JoinColumn(name = "fk_idPaciente", insertable = false, updatable = false)
	private Paciente paciente;
	@OneToMany
	@JoinColumn(name = "fk_idAtendimento")
	private ArrayList<Atendimento> situacaoDePaciente;

	/**
	 * 
	 */
	public Entrada() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idEntrada
	 */
	public int getIdEntrada() {
		return idEntrada;
	}

	/**
	 * @param idEntrada the idEntrada to set
	 */
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	/**
	 * @return the dataEntrada
	 */
	public Date getDataEntrada() {
		return dataEntrada;
	}

	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	/**
	 * @return the dataSaida
	 */
	public Date getDataSaida() {
		return dataSaida;
	}

	/**
	 * @param dataSaida the dataSaida to set
	 */
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	/**
	 * @return the statusEntrada
	 */
	public String getStatusEntrada() {
		return statusEntrada;
	}

	/**
	 * @param statusEntrada the statusEntrada to set
	 */
	public void setStatusEntrada(String statusEntrada) {
		this.statusEntrada = statusEntrada;
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
	 * @return the situacaoDePaciente
	 */
	public ArrayList<Atendimento> getSituacaoDePaciente() {
		return situacaoDePaciente;
	}

	/**
	 * @param situacaoDePaciente the situacaoDePaciente to set
	 */
	public void setSituacaoDePaciente(ArrayList<Atendimento> situacaoDePaciente) {
		this.situacaoDePaciente = situacaoDePaciente;
	}

}
