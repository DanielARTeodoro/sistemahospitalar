package br.com.hospitalif.rascunho;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "tb_FuncionarioPessoa")

public class FuncionarioPessoa {

	/// Funcionario

	private int idFuncionario;

	private String login;

	private String senha;

	private String statusDeUsuario;

	/// Enfermeiro

	private int numeroDeRegistroEnfermeiro;

	// Gerente

	private String cargo;

	/// Medico

	private int numeroDeRegistroMedico;

	private String especialidade;

	public FuncionarioPessoa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idFuncionario
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}

	/**
	 * @param idFuncionario the idFuncionario to set
	 */
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the statusDeUsuario
	 */
	public String getStatusDeUsuario() {
		return statusDeUsuario;
	}

	/**
	 * @param statusDeUsuario the statusDeUsuario to set
	 */
	public void setStatusDeUsuario(String statusDeUsuario) {
		this.statusDeUsuario = statusDeUsuario;
	}

	/**
	 * @return the numeroDeRegistroEnfermeiro
	 */
	public int getNumeroDeRegistroEnfermeiro() {
		return numeroDeRegistroEnfermeiro;
	}

	/**
	 * @param numeroDeRegistroEnfermeiro the numeroDeRegistroEnfermeiro to set
	 */
	public void setNumeroDeRegistroEnfermeiro(int numeroDeRegistroEnfermeiro) {
		this.numeroDeRegistroEnfermeiro = numeroDeRegistroEnfermeiro;
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

	/**
	 * @return the numeroDeRegistroMedico
	 */
	public int getNumeroDeRegistroMedico() {
		return numeroDeRegistroMedico;
	}

	/**
	 * @param numeroDeRegistroMedico the numeroDeRegistroMedico to set
	 */
	public void setNumeroDeRegistroMedico(int numeroDeRegistroMedico) {
		this.numeroDeRegistroMedico = numeroDeRegistroMedico;
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
