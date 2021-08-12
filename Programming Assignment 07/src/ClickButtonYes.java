import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;

//PP 4.12
public class ClickButtonYes extends Application
{	
@Override 
	public void start(Stage primaryStage) 
	{
		Button btn = new Button();
		btn.setText("I'm not Maliware");
		btn.setOnAction(new EventHandler<ActionEvent>()
		
		{
	       @Override
	            public void handle(ActionEvent event) 
	       {

	    	   if(1 <= 2)
	    	   {
	    		   Random rand = new Random();
		    	   int num = rand.nextInt(100) + 1;
		    	   
		    	   System.out.println(num);
	    	   }
	    	   
	       }
		});
		
		StackPane scene = new StackPane();
		scene.getChildren().add(btn);
	    primaryStage.setTitle("Click The Button");
	    primaryStage.setScene(new Scene(scene, 300, 300));
	    primaryStage.show();
	 }
		

	 public static void main(String[] args) 
	 {
	   launch(args);
	 }
	
}