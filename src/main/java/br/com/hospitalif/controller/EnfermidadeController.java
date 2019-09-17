/**
 * Sample Skeleton for 'Enfermidade.fxml' Controller Class
 */

package br.com.hospitalif.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermidadeController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtEnfermidade1"
	private TextField txtEnfermidade1; // Value injected by FXMLLoader

	@FXML // fx:id="txtEnfermidade2"
	private TextField txtEnfermidade2; // Value injected by FXMLLoader

	@FXML // fx:id="txtEnfermidade3"
	private TextField txtEnfermidade3; // Value injected by FXMLLoader

	@FXML // fx:id="btnEnfermidade"
	private Button btnEnfermidade; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtEnfermidade1 != null : "fx:id=\"txtEnfermidade1\" was not injected: check your FXML file 'Enfermidade.fxml'.";
		assert txtEnfermidade2 != null : "fx:id=\"txtEnfermidade2\" was not injected: check your FXML file 'Enfermidade.fxml'.";
		assert txtEnfermidade3 != null : "fx:id=\"txtEnfermidade3\" was not injected: check your FXML file 'Enfermidade.fxml'.";
		assert btnEnfermidade != null : "fx:id=\"btnEnfermidade\" was not injected: check your FXML file 'Enfermidade.fxml'.";

	}
}
