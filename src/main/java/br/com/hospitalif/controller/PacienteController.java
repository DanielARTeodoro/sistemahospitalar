/**
 * Sample Skeleton for 'Paciente.fxml' Controller Class
 */

package br.com.hospitalif.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PacienteController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="btnCadastrar9"
	private Button btnCadastrar9; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente"
	private TableView<?> tabPaciente; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente0"
	private TableColumn<?, ?> tabPaciente0; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente1"
	private TableColumn<?, ?> tabPaciente1; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente2"
	private TableView<?> tabPaciente2; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente3"
	private TableColumn<?, ?> tabPaciente3; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente4"
	private TableColumn<?, ?> tabPaciente4; // Value injected by FXMLLoader

	@FXML // fx:id="tabPaciente5"
	private TableColumn<?, ?> tabPaciente5; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert btnCadastrar9 != null : "fx:id=\"btnCadastrar9\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente != null : "fx:id=\"tabPaciente\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente0 != null : "fx:id=\"tabPaciente0\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente1 != null : "fx:id=\"tabPaciente1\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente2 != null : "fx:id=\"tabPaciente2\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente3 != null : "fx:id=\"tabPaciente3\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente4 != null : "fx:id=\"tabPaciente4\" was not injected: check your FXML file 'Paciente.fxml'.";
		assert tabPaciente5 != null : "fx:id=\"tabPaciente5\" was not injected: check your FXML file 'Paciente.fxml'.";

	}
}
