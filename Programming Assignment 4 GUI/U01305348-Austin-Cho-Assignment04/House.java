	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.*;
	import javafx.stage.Stage;
	//PP 3.12
	public class House extends Application 
	{

	  public void start(Stage primaryStage) 
	  {
	    Circle knob = new Circle(170, 310, 4);
	    knob.setStroke(Color.BLACK);
	    knob.setStrokeWidth(3);
	    knob.setFill(null);

	    Rectangle door = new Rectangle();
	    door.setX(155);
	    door.setY(250);
	    door.setWidth(70);
	    door.setHeight(100);
	    door.setStroke(Color.BLACK);
	    door.setStrokeWidth(3);
	    door.setFill(null);
	    /////////////////////////////////////////////
	    Rectangle window1 = new Rectangle();
	    window1.setX(280);
	    window1.setY(250);
	    window1.setWidth(50);
	    window1.setHeight(50);
	    window1.setStroke(Color.BLACK);
	    window1.setStrokeWidth(3);
	    window1.setFill(null);
	    
	    //Window 1 Design
	    //SELF NOTE:		  X1   Y1   X2  Y2
	    Line line1 = new Line(100, 275, 50, 275);
	    line1.setStrokeWidth(3);
	    line1.setStroke(Color.BLACK);
	    
	    Line line2 = new Line(75, 250, 75, 300);
	    line2.setStrokeWidth(3);
	    line2.setStroke(Color.BLACK);
	    //////////////////////////////////////////////
	    Rectangle window2 = new Rectangle();
	    window2.setX(50);
	    window2.setY(250);
	    window2.setWidth(50);
	    window2.setHeight(50);
	    window2.setStroke(Color.BLACK);
	    window2.setStrokeWidth(3);
	    window2.setFill(null);
	    
	    //Window 2 Design
	    Line line3 = new Line(280, 275, 330, 275);
	    line3.setStrokeWidth(3);
	    line3.setStroke(Color.BLACK);
	    
	    Line line4 = new Line(305, 250, 305, 300);
	    line4.setStrokeWidth(3);
	    line4.setStroke(Color.BLACK);
	   
	    //Main structure of the house
	    Rectangle body = new Rectangle();
	    body.setX(20);
	    body.setY(150);
	    body.setWidth(350);
	    body.setHeight(200);
	    body.setStroke(Color.BLACK);
	    body.setStrokeWidth(3);
	    body.setFill(null);
	    
	    //Roof design
	    Line roof1 = new Line(10, 152, 190, 100);
	    roof1.setStrokeWidth(3);
	    roof1.setStroke(Color.BLACK);
	    
	    Line roof2 = new Line(380, 152, 190, 100);
	    roof2.setStrokeWidth(3);
	    roof2.setStroke(Color.BLACK);
	    
	    //Chimney
	    Line chim1 = new Line(100, 75, 50, 75);
	    chim1.setStrokeWidth(3);
	    chim1.setStroke(Color.BLACK);
	    
	    Line chim2 = new Line(50, 75, 50, 140);
	    chim2.setStrokeWidth(3);
	    chim2.setStroke(Color.BLACK);
	    
	    Line chim3 = new Line(100, 75, 100, 125);
	    chim3.setStrokeWidth(3);
	    chim3.setStroke(Color.BLACK);
	    
	    //Smoke
	    Circle smoke1 = new Circle(75, 60, 20);
	    smoke1.setStroke(Color.GRAY);
	    smoke1.setStrokeWidth(3);
	    smoke1.setFill(Color.GRAY);
	    
	    Circle smoke2 = new Circle(90, 40, 20);
	    smoke2.setStroke(Color.GRAY);
	    smoke2.setStrokeWidth(3);
	    smoke2.setFill(Color.GRAY);
	    
	    Circle smoke3 = new Circle(115, 20, 20);
	    smoke3.setStroke(Color.GRAY);
	    smoke3.setStrokeWidth(3);
	    smoke3.setFill(Color.GRAY);
	    
	    //CLOUDS DEAR GOD WHY DOES IT WANT CLOUDS
	    Ellipse cloud1 = new Ellipse(375, 50, 80, 45);
	    cloud1.setStroke(Color.BLACK);
	    cloud1.setStrokeWidth(3);
	    cloud1.setFill(Color.WHITE);
	    
	    Ellipse cloud2 = new Ellipse(450, 75, 80, 50);
	    cloud2.setStroke(Color.BLACK);
	    cloud2.setStrokeWidth(3);
	    cloud2.setFill(Color.WHITE);
	    
	    Ellipse cloud3 = new Ellipse(415, 65, 60, 40);
	    cloud3.setStroke(Color.WHITE);
	    cloud3.setStrokeWidth(3);
	    cloud3.setFill(Color.WHITE);
	    
	    Pane pane = new Pane();
	    pane.getChildren().add(knob);
	    pane.getChildren().add(door);
	    pane.getChildren().add(body);
	    
	    pane.getChildren().add(window1);
	    pane.getChildren().add(window2);
	    pane.getChildren().add(line1);
	    pane.getChildren().add(line2);
	    pane.getChildren().add(line3);
	    pane.getChildren().add(line4);
	    
	    pane.getChildren().add(roof1);
	    pane.getChildren().add(roof2);
	    
	    pane.getChildren().add(chim1);
	    pane.getChildren().add(chim2);
	    pane.getChildren().add(chim3);
	    
	    pane.getChildren().add(smoke1);
	    pane.getChildren().add(smoke2);
	    pane.getChildren().add(smoke3);
	    
	    pane.getChildren().add(cloud1);
	    pane.getChildren().add(cloud2);
	    pane.getChildren().add(cloud3);
	    
	    Scene scene = new Scene(pane, 500, 400);
	    primaryStage.setTitle("House");
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	  }

	  public static void main(String[] args) {
	    launch(args);
	    
	  }
	}