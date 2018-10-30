package application;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
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
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;

public class Exercice3 extends Application{
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Exercice 3");
			primaryStage.setScene(scene);
			primaryStage.show();
			BackgroundFill bgFillVert = new BackgroundFill(Color.LIGHTGREEN, new CornerRadii(10), new Insets(40));
			BackgroundFill bgFillRouge = new BackgroundFill(Color.RED, new CornerRadii(25), new Insets(60));
			Background bg = new Background(bgFillVert,bgFillRouge);
			root.setBackground(bg);
			Image image = new Image("hydrangeas.PNG");
			BackgroundSize bgTaille = new BackgroundSize(200,200,false,false,false,false);
			BackgroundImage bgImage = new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,bgTaille);
			BackgroundFill[] tbgfill = new BackgroundFill[2];
			tbgfill[0] = bgFillVert;
			tbgfill[1] = bgFillRouge;
			BackgroundImage[] tbgImage = new BackgroundImage[1];
			tbgImage[0] = bgImage;
			Background bg1 = new Background(tbgfill,tbgImage);
			root.setBackground(bg1);
			
			BorderStrokeStyle styleBleu = new BorderStrokeStyle(StrokeType.CENTERED,StrokeLineJoin.MITER,StrokeLineCap.BUTT,10,0,null);
			BorderStrokeStyle styleCyan = new BorderStrokeStyle(StrokeType.INSIDE,StrokeLineJoin.MITER,StrokeLineCap.BUTT,10,0,null);
			
			BorderStroke bordureBleu = new BorderStroke(Color.ALICEBLUE.BLUE,styleBleu,CornerRadii.EMPTY,new BorderWidths(30),new Insets(20));
			BorderStroke bordureCyan = new BorderStroke(Color.ALICEBLUE.CYAN,styleCyan,new CornerRadii(15),new BorderWidths(16),new Insets(15));
			
			Border bordure = new Border(bordureBleu,bordureCyan);
			root.setBorder(bordure);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
