import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

//PP 4.13
public class MovingCircle extends Application
{	
@Override 
	public void start(Stage primaryStage) 
	{		
		Circle circle = new Circle();
			circle.setRadius(50);
			circle.setStroke(null);
			circle.setFill(Color.LIGHTBLUE);
			
		Button btn = new Button();
			btn.setText("Move");
			btn.setLayoutX(250);
			btn.setLayoutY(250);
			btn.setOnAction(new EventHandler<ActionEvent>()
			
			{
				@Override
	            public void handle(ActionEvent event) 
				{

					if(1 <= 2)
					{
						Random rand = new Random();
						int num1 = rand.nextInt(500) + 1;
						int num2 = rand.nextInt(500) + 1;
						circle.setCenterX(num1);
						circle.setCenterY(num2);
					}
	    	   }
			});
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 500, 500);
		
			pane.getChildren().add(circle);
			pane.getChildren().add(btn);
			primaryStage.setTitle("Click The Button");
			primaryStage.setScene(scene);
			primaryStage.show();
	 }
		

	 public static void main(String[] args) 
	 {
	   launch(args);
	 }
	
}