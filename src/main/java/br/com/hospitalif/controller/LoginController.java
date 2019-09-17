/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

package br.com.hospitalif.controller;

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

public class LoginController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtLogin"
	private TextField txtLogin; // Value injected by FXMLLoader

	@FXML // fx:id="txtSenha"
	private TextField txtSenha; // Value injected by FXMLLoader

	@FXML // fx:id="btnLogar"
	private Button btnLogar; // Value injected by FXMLLoader

	@FXML // fx:id="btnCadastrar"
	private Button btnCadastrar; // Value injected by FXMLLoader

	@FXML
	void handleSubmitButtonAction(ActionEvent event) {

		try {

			FXMLLoader.load(getClass().getResource("../view/Entrada.fxml"));
			Stage stage = new Stage();
			//Scene scene = new Scene(root);
			//stage.setScene(scene);
			stage.show();
			stage.setTitle("Hospital IF");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void handleSubmitButtonAction0(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtLogin != null : "fx:id=\"txtLogin\" was not injected: check your FXML file 'Login.fxml'.";
		assert txtSenha != null : "fx:id=\"txtSenha\" was not injected: check your FXML file 'Login.fxml'.";
		assert btnLogar != null : "fx:id=\"btnLogar\" was not injected: check your FXML file 'Login.fxml'.";
		assert btnCadastrar != null : "fx:id=\"btnCadastrar\" was not injected: check your FXML file 'Login.fxml'.";

	}
}
