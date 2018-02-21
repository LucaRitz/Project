package com.proj.main;

import javafx.application.Application;
import javafx.stage.Stage;

public class StartUp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title");
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
