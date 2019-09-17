/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hospitalif.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 * 
 */

public class StageManager {
	private static final Logger LOG = LogManager.getLogger(StageManager.class);
	private final Stage primaryStage;

	public StageManager(Stage stage) {
		this.primaryStage = stage;
	}

	// Trocar cena
	public void switchScene(final FxmlView view) {
		// Parent viewRootNodeHierarchy = loadViewNodeHierarchy(view.getFxmlFile());
		// show(viewRootNodeHierarchy, view.getTitle());
	}

	//
	private void show(final Parent rootnode, String title) {
		Scene scene = prepareScene(rootnode);
		// scene.getStylesheets().add("/styles/Styles.css");

		// primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setTitle(title);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.centerOnScreen();

		try {
			primaryStage.show();
		} catch (Exception exception) {
			logAndExit("Unable to show scene for title" + title, exception);
		}
	}

	private Scene prepareScene(Parent rootnode) {
		Scene scene = primaryStage.getScene();

		if (scene == null) {
			scene = new Scene(rootnode);
		}
		scene.setRoot(rootnode);
		return scene;
	}

	/**
	 * Loads the object hierarchy from a FXML document and returns to root node of
	 * that hierarchy.
	 *
	 * @return Parent root node of the FXML document hierarchy
	 */

	private void logAndExit(String errorMsg, Exception exception) {
		LOG.error(errorMsg, exception, exception.getCause());
		Platform.exit();
	}

}
