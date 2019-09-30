/**
 * Sample Skeleton for 'Enfermeiro.fxml' Controller Class
 */

package br.com.hospitalif.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermeiroController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="btnCadastrar9"
	private Button btnCadastrar9; // Value injected by FXMLLoader

	@FXML // fx:id="txtEnfermeiro"
	private TextField txtEnfermeiro; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert btnCadastrar9 != null : "fx:id=\"btnCadastrar9\" was not injected: check your FXML file 'Enfermeiro.fxml'.";
		assert txtEnfermeiro != null : "fx:id=\"txtEnfermeiro\" was not injected: check your FXML file 'Enfermeiro.fxml'.";

	}
}
