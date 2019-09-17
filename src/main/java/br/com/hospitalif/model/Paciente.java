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
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
@Table(name = "tb_paciente")

public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "idPaciente")
	private int idPaciente;

	@OneToOne
	@JoinColumn(name = "fk_idPessoa")
	private Pessoa pessoa;

	@OneToMany
	@JoinColumn(name = "fk_idEnfermidadePessoal")
	private List<EnfermidadePessoal> doenca;

	@OneToMany
	@JoinColumn(name = "fk_idEntrada")
	private List<Entrada> historico;

	/**
	 * 
	 */
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idPaciente
	 */
	public int getIdPaciente() {
		return idPaciente;
	}

	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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

	/**
	 * @return the historico
	 */
	public List<Entrada> getHistorico() {
		return historico;
	}

	/**
	 * @param historico the historico to set
	 */
	public void setHistorico(List<Entrada> historico) {
		this.historico = historico;
	}

}
