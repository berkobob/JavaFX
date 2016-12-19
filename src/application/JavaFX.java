package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX extends Application {

	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("New window coming soon");
		
		Button button = new Button("Click me");
		button.setOnAction(e-> AlertBox.display("My new window", "Welcome to my new window"));
		
		StackPane layout = new StackPane(); 
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 200, 200);
		
		window.setScene(scene);
		window.show();
	}
}
