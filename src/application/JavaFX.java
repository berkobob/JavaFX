package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFX extends Application {

	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of the Window");
		
		button = new Button("Click me");
		button.setOnAction(e -> System.out.println("Button pressed"));
		
		Button button2 = new Button("Prints two lines");
		button2.setOnAction(e -> {
			System.out.println("Line 1");
			System.out.println("Line 2");
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		layout.getChildren().add(button2);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
