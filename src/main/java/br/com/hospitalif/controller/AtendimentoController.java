/**
 * Sample Skeleton for 'Atendimento.fxml' Controller Class
 */

package br.com.hospitalif.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AtendimentoController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtAtendimento"
	private TextField txtAtendimento; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento0"
	private TextField txtAtendimento0; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento2"
	private TextArea txtAtendimento2; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento3"
	private TextArea txtAtendimento3; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento7"
	private Button txtAtendimento7; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento1"
	private DatePicker txtAtendimento1; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento4"
	private TableView<?> txtAtendimento4; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento5"
	private TableColumn<?, ?> txtAtendimento5; // Value injected by FXMLLoader

	@FXML // fx:id="txtAtendimento6"
	private TableColumn<?, ?> txtAtendimento6; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtAtendimento != null : "fx:id=\"txtAtendimento\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento0 != null : "fx:id=\"txtAtendimento0\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento2 != null : "fx:id=\"txtAtendimento2\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento3 != null : "fx:id=\"txtAtendimento3\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento7 != null : "fx:id=\"txtAtendimento7\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento1 != null : "fx:id=\"txtAtendimento1\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento4 != null : "fx:id=\"txtAtendimento4\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento5 != null : "fx:id=\"txtAtendimento5\" was not injected: check your FXML file 'Atendimento.fxml'.";
		assert txtAtendimento6 != null : "fx:id=\"txtAtendimento6\" was not injected: check your FXML file 'Atendimento.fxml'.";

	}
}
