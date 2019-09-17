/**
 * Sample Skeleton for 'Pessoa.fxml' Controller Class
 */

package br.com.hospitalif.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PessoaController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtPessoa5"
	private Button txtPessoa5; // Value injected by FXMLLoader

	@FXML // fx:id="txtPessoa"
	private TextField txtPessoa; // Value injected by FXMLLoader

	@FXML // fx:id="txtPessoa1"
	private TextField txtPessoa1; // Value injected by FXMLLoader

	@FXML // fx:id="txtPessoa3"
	private TextField txtPessoa3; // Value injected by FXMLLoader

	@FXML // fx:id="txtPessoa0"
	private TextField txtPessoa0; // Value injected by FXMLLoader

	@FXML // fx:id="txtPessoa2"
	private TextField txtPessoa2; // Value injected by FXMLLoader

	@FXML // fx:id="txtPessoa4"
	private TextField txtPessoa4; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtPessoa5 != null : "fx:id=\"txtPessoa5\" was not injected: check your FXML file 'Pessoa.fxml'.";
		assert txtPessoa != null : "fx:id=\"txtPessoa\" was not injected: check your FXML file 'Pessoa.fxml'.";
		assert txtPessoa1 != null : "fx:id=\"txtPessoa1\" was not injected: check your FXML file 'Pessoa.fxml'.";
		assert txtPessoa3 != null : "fx:id=\"txtPessoa3\" was not injected: check your FXML file 'Pessoa.fxml'.";
		assert txtPessoa0 != null : "fx:id=\"txtPessoa0\" was not injected: check your FXML file 'Pessoa.fxml'.";
		assert txtPessoa2 != null : "fx:id=\"txtPessoa2\" was not injected: check your FXML file 'Pessoa.fxml'.";
		assert txtPessoa4 != null : "fx:id=\"txtPessoa4\" was not injected: check your FXML file 'Pessoa.fxml'.";

	}
}
