import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.util.Random;
// PP 3.14
public class RandomAngle extends Application 
{
  @Override 
  public void start(Stage primaryStage) 
  {
	Random rand = new Random();
	
	int number = rand.nextInt(360) + 0;
	int x = 50;
	int y = 50;
	
    Text text = new Text(x, y, "Austin");
    text.setRotate(number);
    
    Pane pane = new Pane();
    pane.getChildren().add(text);   
    Scene scene = new Scene(pane, 100, 100);
    
    primaryStage.setTitle("Name in different angles YEY"); 
    primaryStage.setScene(scene); 
    primaryStage.show();   
  }
  

  public static void main(String[] args) {
    launch(args);
  }
}
