/**
 * Sample Skeleton for 'Entrada.fxml' Controller Class
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
import javafx.scene.control.TextField;

public class EntradaController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtEntrada3"
	private TextField txtEntrada3; // Value injected by FXMLLoader

	@FXML // fx:id="btnEntrada"
	private Button btnEntrada; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada0"
	private TableView<?> txtEntrada0; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada4"
	private TableColumn<?, ?> txtEntrada4; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada5"
	private TableColumn<?, ?> txtEntrada5; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada6"
	private TableColumn<?, ?> txtEntrada6; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada7"
	private TableColumn<?, ?> txtEntrada7; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada8"
	private TableColumn<?, ?> txtEntrada8; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada1"
	private DatePicker txtEntrada1; // Value injected by FXMLLoader

	@FXML // fx:id="txtEntrada2"
	private DatePicker txtEntrada2; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtEntrada3 != null : "fx:id=\"txtEntrada3\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert btnEntrada != null : "fx:id=\"btnEntrada\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada0 != null : "fx:id=\"txtEntrada0\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada4 != null : "fx:id=\"txtEntrada4\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada5 != null : "fx:id=\"txtEntrada5\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada6 != null : "fx:id=\"txtEntrada6\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada7 != null : "fx:id=\"txtEntrada7\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada8 != null : "fx:id=\"txtEntrada8\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada1 != null : "fx:id=\"txtEntrada1\" was not injected: check your FXML file 'Entrada.fxml'.";
		assert txtEntrada2 != null : "fx:id=\"txtEntrada2\" was not injected: check your FXML file 'Entrada.fxml'.";

	}
}
