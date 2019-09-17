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
import javax.persistence.Table;

/**
 * @author Daniel
 *
 */

@Entity
@Table(name = "tb_pessoa")

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "idPessoa")
	private int idPessoa;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "idade")
	private int idade;
	@Column(name = "tipoSanguineo")
	private String tipoSanguineo;
	@Column(name = "sexo")
	private char sexo;
	@Column(name = "statusDePessoa")
	private String statusDePessoa;

	/**
	 * 
	 */
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idPessoa
	 */
	public int getIdPessoa() {
		return idPessoa;
	}

	/**
	 * @param idPessoa the idPessoa to set
	 */
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the tipoSanguineo
	 */
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	/**
	 * @param tipoSanguineo the tipoSanguineo to set
	 */
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the statusDePessoa
	 */
	public String getStatusDePessoa() {
		return statusDePessoa;
	}

	/**
	 * @param statusDePessoa the statusDePessoa to set
	 */
	public void setStatusDePessoa(String statusDePessoa) {
		this.statusDePessoa = statusDePessoa;
	}

}
