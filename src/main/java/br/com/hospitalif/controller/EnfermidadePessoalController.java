/**
 * Sample Skeleton for 'EnfermidadePessoal.fxml' Controller Class
 */

package br.com.hospitalif.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermidadePessoalController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="btnEnfermidadePessoal"
	private Button btnEnfermidadePessoal; // Value injected by FXMLLoader

	@FXML // fx:id="txtEnfermidadePessoal0"
	private TextField txtEnfermidadePessoal0; // Value injected by FXMLLoader

	@FXML // fx:id="txtEnfermidadePessoal1"
	private TextField txtEnfermidadePessoal1; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert btnEnfermidadePessoal != null : "fx:id=\"btnEnfermidadePessoal\" was not injected: check your FXML file 'EnfermidadePessoal.fxml'.";
		assert txtEnfermidadePessoal0 != null : "fx:id=\"txtEnfermidadePessoal0\" was not injected: check your FXML file 'EnfermidadePessoal.fxml'.";
		assert txtEnfermidadePessoal1 != null : "fx:id=\"txtEnfermidadePessoal1\" was not injected: check your FXML file 'EnfermidadePessoal.fxml'.";

	}
}
