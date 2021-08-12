import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random; 
//PP 3.13
public class RandomCircle extends Application 
{
  @Override 
  public void start(Stage primaryStage) 
  {    
    Random rand= new Random(); 
    Pane pane = new Pane();
    
    int number = rand.nextInt(150) + 50;
    
    Circle circle = new Circle();
    circle.setCenterX(200);
    circle.setCenterY(200);

    circle.setRadius(number);
    circle.setStroke(Color.BLACK); 
    circle.setFill(Color.WHITE);
    pane.getChildren().add(circle);

    Scene scene = new Scene(pane, 500, 500);
    primaryStage.setTitle("Random Circle");
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}