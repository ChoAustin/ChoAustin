import java.util.Random;
import java.awt.color.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
// PP 3.15
public class RandomColors extends Application 
{
  @Override 
  public void start(Stage primaryStage) 
  {
	Random rand = new Random();
    
	int r = (int) Math.round(Math.random() * 255);
	int g = (int) Math.round(Math.random() * 255);
	int b = (int) Math.round(Math.random() * 255);
	
	Color color = Color.rgb(r, g, b);
	
	 Rectangle box = new Rectangle();
	    box.setX(50);
	    box.setY(50);
	    box.setWidth(70);
	    box.setHeight(100);
	    box.setStroke(Color.BLACK);
	    box.setStrokeWidth(3);
	    box.setFill(color);
	
    Pane pane = new Pane();
    
       pane.getChildren().add(box);
       
    Scene scene = new Scene(pane, 200, 200);
    
    primaryStage.setTitle("Random Colors!!!"); 
    primaryStage.setScene(scene); 
    primaryStage.show();   
  }
  

  public static void main(String[] args) {
    launch(args);
  }
}