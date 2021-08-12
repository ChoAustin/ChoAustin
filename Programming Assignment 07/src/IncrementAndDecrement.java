import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Random;

//PP 4.14
public class IncrementAndDecrement extends Application
{	
@Override 
	public void start(Stage primaryStage) 
	{		
		System.out.println("Initial Number: 50");
			
		Button btn1 = new Button();
			btn1.setText("Increment");
			btn1.setLayoutX(100);
			btn1.setLayoutY(10);
			btn1.setOnAction(new EventHandler<ActionEvent>()	
			{
				@Override
	            public void handle(ActionEvent event) 
				{

					if(1 <= 2)
					{
						Random rand = new Random();
						int num1 = rand.nextInt(100) + 1;
						
						int result1 = num1 + 50;
						
						System.out.println(result1);
					}
	    	   }
			});
			 
		Button btn2 = new Button();
			btn2.setText("Decrement");
			btn2.setLayoutX(10);
			btn2.setLayoutY(10);
			btn2.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
	            public void handle(ActionEvent event) 
				{

					if(1 <= 2)
					{
						Random rand = new Random();
						int num2 = rand.nextInt(100) + 1;
						
						int result2 = num2 - 50;
						
						System.out.println(result2);
					}
	    	   }
			});
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 200, 100);
		
			pane.getChildren().add(btn1);
			pane.getChildren().add(btn2);
			primaryStage.setTitle("Click The Button");
			primaryStage.setScene(scene);
			primaryStage.show();
	 }
		

	 public static void main(String[] args) 
	 {
	   launch(args);
	 }
	
}