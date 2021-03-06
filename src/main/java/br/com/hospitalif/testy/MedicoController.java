/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 * Sample Skeleton for 'medico.fxml' Controller Class
 */

package br.com.hospitalif.testy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Daniel
 *
 */
public class MedicoController {
	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="btnCadastrar9"
	private Button btnCadastrar9; // Value injected by FXMLLoader

	@FXML // fx:id="txtMedico"
	private TextField txtMedico; // Value injected by FXMLLoader

	@FXML // fx:id="txtMedico0"
	private TextField txtMedico0; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) throws IOException {

		if (txtMedico.getText().equals("")) {
			Stage stage = (Stage) btnCadastrar9.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("../view/Home.fxml"));
			Scene scene = new Scene(root);
			/// scene.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
			stage.setTitle("Alerta: ERRO!");
			stage.setScene(scene);
			stage.show();
		} else {
			Medico me = new Medico();
			me.setNumeroDeRegistro(Integer.parseInt(txtMedico.getText()));
			me.setEspecialidade(txtMedico0.getText());

			MedicoDAO efdaom = new MedicoDAO();
			efdaom.inserir(me);

			Stage stage = (Stage) btnCadastrar9.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("../view/Home.fxml"));
			Scene scene = new Scene(root);
			/// scene.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
			stage.setTitle("Alerta: Sucesso!");
			stage.setScene(scene);
			stage.show();
		}

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert btnCadastrar9 != null : "fx:id=\"btnCadastrar9\" was not injected: check your FXML file 'Medico.fxml'.";
		assert txtMedico != null : "fx:id=\"txtMedico\" was not injected: check your FXML file 'Medico.fxml'.";
		assert txtMedico0 != null : "fx:id=\"txtMedico0\" was not injected: check your FXML file 'Medico.fxml'.";

	}
}
