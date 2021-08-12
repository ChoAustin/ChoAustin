import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;

//PP 4.11
public class ImageDisplay extends Application 
{

	public void start(Stage primaryStage) 
	{
		Image img = new Image("pepe.jpg");
		ImageView pepe1 = new ImageView(img);
		pepe1.setFitWidth(500);
		pepe1.setFitHeight(520);
		
		ImageView pepe2 = new ImageView();
        pepe2.setImage(img);
        pepe2.setFitWidth(100);
        pepe2.setFitHeight(120);
        pepe2.setRotate(90);

		Group root = new Group();
		Scene scene = new Scene(root, 700, 720);
		scene.setFill(Color.GRAY);
		
		HBox box = new HBox();
        box.getChildren().add(pepe1);
        box.getChildren().add(pepe2);
        root.getChildren().add(box);
		
		primaryStage.setTitle("PePe le Frog");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	  public static void main(String[] args) 
	  {
	    Application.launch(args);
	  }

}
