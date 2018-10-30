package application;
	
import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.*;

public class Exercice2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,320,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Exercice 2");
			primaryStage.setScene(scene);
			primaryStage.show();
			Button button1 = new Button("Quitter");
			Label label1 = new Label("Test Interface Graphique");
			root.getChildren().add(button1);
			root.getChildren().add(label1);
			label1.setLayoutX(20);
			label1.setLayoutY(30);
			button1.setLayoutX(30);
			button1.setLayoutY(60);
			root.setTranslateX(100);
			button1.setRotate(45);
			Button btnOk = new Button("btnOK");
			btnOk.setLayoutX(10);
			btnOk.setLayoutY(150);
			Button btnAnnuler = new Button("Annuler");
			NumberBinding layX = btnOk.layoutXProperty().add(btnOk.widthProperty().add(10));
			btnAnnuler.layoutXProperty().bind(layX);
			btnAnnuler.layoutYProperty().bind(btnOk.layoutYProperty());
			root.getChildren().addAll(btnOk,btnAnnuler);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
