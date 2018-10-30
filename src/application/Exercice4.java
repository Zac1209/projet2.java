package application;

import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Exercice4 extends Application{
	public void start(Stage primaryStage) {
		try {
			HBox root = createHBox();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Les layouts");
			primaryStage.show();
			
			BorderStrokeStyle styleCyan = new BorderStrokeStyle(StrokeType.INSIDE,StrokeLineJoin.MITER,StrokeLineCap.BUTT,10,0,null);
		
			BorderStroke bordureCyan = new BorderStroke(Color.ALICEBLUE.CYAN,styleCyan,new CornerRadii(15),new BorderWidths(16),new Insets(15));
			
			Border bordure = new Border(bordureCyan);
			root.setBorder(bordure);
			root.setAlignment(Pos.TOP_CENTER);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	private HBox createHBox() {
		HBox  hBox = new HBox();
		//padding: distance entre les noeuds et les bordures du panneau VBox. 
		//Spacing: distance entre les noeuds.
		//margins: espace supplémentaires autour d'un contrôle, 
		
		hBox.setPadding(new Insets(40,10,40,15));
	    hBox.setSpacing(20);
		Button btn1= new Button("bouton 1");
		btn1.setPrefSize(200, 50);
		
		btn1.setMaxSize(400, 200);
		btn1.setMinSize(250, 30);
	
		TextField txtField = new TextField(" peut changer de taille");
		TextField txtField1 = new TextField("ne  peut changer de taille");
		Button btn2  =new Button("bouton 2");
		Button btn3 = new Button (" bouton 3 a un non long");
		Button btn4 = new Button("4");
		Button btn5 = new Button("un bouton avec une taille fixée");
		btn5.setPrefSize(200,50);
	
		
		//HBox.setMargin(btn1, new Insets(20,20,20,70));
	//	HBox.setMargin(btn2, new Insets(20,20,20,50));
		
		
		hBox.getChildren().addAll(btn1, btn2,txtField, btn3,txtField1,btn4,btn5);
		// par défaut les composants ne changent pas de taille quand on agrandit. 


		//agrandissement d'un composant avec le Layout
		HBox.setHgrow(txtField, Priority.ALWAYS);
		HBox.setHgrow(btn4, Priority.ALWAYS);
      	
		HBox.setHgrow(btn1, Priority.ALWAYS);
		//btn4.setMaxWidth(Double.MAX_VALUE);
		
		// pour limiter l'expansion des contrôles. 
		btn4.setMaxWidth(100);
		txtField.setMaxWidth(400);
		
		
		// Pour éviter les ...quand on réduit la largeur de la fenêtre 
		btn1.setMinWidth(Button.USE_PREF_SIZE);
		 // si on veut interdire le redimensionnement d'un composant
		// min = max = prefferred size
		
	     btn2.setMaxWidth(100);
	     btn2.setMaxWidth(100);
	     btn2.setPrefWidth(100);
	     
		return hBox;
	}


}
