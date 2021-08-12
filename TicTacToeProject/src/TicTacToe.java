import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;


public class TicTacToe extends Application
{
	private boolean playable = true;
	private boolean turnX = true;
	
	private Tile[][] board = new Tile[3][3];
	private List<ComboList> combos = new ArrayList<>();
	private Pane root = new Pane();
	
	private Button Start = new Button("Play Game");
	private Button quit = new Button("Quit");
	private Button playAgain = new Button("Play Again?");
	
	private Parent createContent1()
	{
		root.setPrefSize(1000, 600);
		
		Start.setPrefSize(200, 100);
		Start.setTranslateX(400);
		Start.setTranslateY(250);
		Start.setFont(new Font(30));
		root.getChildren().add(Start);
		
		return root;
	}
	
	private Parent createContent2()
	{

		
				
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				Tile tile = new Tile();
				tile.setTranslateX(j * 200);
				tile.setTranslateY(i * 200);	
				
				root.getChildren().add(tile);
				board[j][i] = tile;
			}
		}
		
		playAgain.setPrefSize(200, 100);
		playAgain.setTranslateX(700);
		playAgain.setTranslateY(75);
		playAgain.setFont(new Font(30));
		root.getChildren().add(playAgain);
		
		
		quit.setPrefSize(200, 100);
		quit.setTranslateX(700);
		quit.setTranslateY(425);
		quit.setFont(new Font(30));
		root.getChildren().add(quit);
		
		// Horizontal COMBOS
		for(int y = 0; y < 3; y++)
		{
			combos.add(new ComboList(board[0][y], board[1][y], board[2][y]));
		}
		
		// Vertical Combos
		for(int x = 0; x < 3; x++)
		{
			combos.add(new ComboList(board[x][0], board[x][1], board[x][2]));
		}
		
		// Diagonal Combos
		combos.add(new ComboList(board[0][0], board[1][1], board[2][2]));
		combos.add(new ComboList(board[2][0], board[1][1], board[0][2]));
		
		return root;
	}
	
	private void checkStateForX()
	{
		
		for(ComboList combo: combos)
		{
			if(combo.isComplete())
			{
				playable = false;
				playWinAnimation(combo);
				break;
			}
		}
		for(ComboList win: combos)
		{
			if(win.isComplete())
			{
				playable = false;
				CaptionX(win);
				break;
			}
		}
	}
	
	private void checkStateForY()
	{
		
		for(ComboList combo: combos)
		{
			if(combo.isComplete())
			{
				playable = false;
				playWinAnimation(combo);
				break;
			}
		}
		for(ComboList win: combos)
		{
			if(win.isComplete())
			{
				playable = false;
				CaptionY(win);
				break;
			}
		}
	}
	
	private void checkStateForD()
	{
		for(ComboList draw: combos)
		{
			if(draw.isTie())
			{
				playable = false;
				CaptionD(draw);
				break;
			}
		}
	}
	
	private void playWinAnimation(ComboList combo) 
	{
		Line line = new Line();
		line.setStrokeWidth(5);
		line.setStroke(Color.WHITE);
		
		line.setStartX(combo.tiles[0].getCenterX());
		line.setStartY(combo.tiles[0].getCenterY());
		line.setEndX(combo.tiles[0].getCenterX());
		line.setEndY(combo.tiles[0].getCenterY());
		
		root.getChildren().add(line);
		
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
				new KeyValue(line.endXProperty(), combo.tiles[2].getCenterX()),
				new KeyValue(line.endYProperty(), combo.tiles[2].getCenterY())));
		timeline.play();
	}
	
	private void CaptionX (ComboList Xwin)
	{
		Text P1V = new Text(610, 325, "Player 1's Victory!");
		P1V.setFont(new Font(50));
		P1V.setFill(Color.BLACK);
		
		root.getChildren().add(P1V);
	}
	
	private void CaptionY (ComboList Ywin)
	{
		Text P2V = new Text(610, 325, "Player 2's Victory!");
		P2V.setFont(new Font(50));
		P2V.setFill(Color.BLACK);
		
		root.getChildren().add(P2V);
	}
	
	private void CaptionD (ComboList draw)
	{
		Text P3V = new Text(610, 325, "DRAW");
		P3V.setFont(new Font(50));
		P3V.setFill(Color.BLACK);
		
		root.getChildren().add(P3V);
	}
	
	private class ComboList
	{
		private Tile[] tiles;
		public ComboList(Tile... tiles)
		{
			this.tiles = tiles;
		}
		
		public boolean isComplete()
		{
			if(tiles[0].getValue().isEmpty())
				return false;
			
			return tiles[0].getValue().equals(tiles[1].getValue())
					&& tiles[0].getValue().equals(tiles[2].getValue());
		}
		
		public boolean isTie()
		{
			if(tiles[0].getValue().equals(tiles[1].getValue()) 
					&& (tiles[1].getValue().equals(tiles[2].getValue())
							&& (tiles[2].getValue().equals(tiles[0].getValue()))));
			return true;
		}
	}

	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(new Scene(createContent1()));
		primaryStage.show();
		
		Start.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent start) 
			{
				primaryStage.setTitle("TicTacToe");
				primaryStage.setScene(new Scene(createContent2()));
				primaryStage.show();
			}
		});
		
		playAgain.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent Restart) 
			{
				primaryStage.close();
				primaryStage.setScene(new Scene(createContent2()));
				primaryStage.show();
			}
		});
		
		quit.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent Shutdown) 
			{
				primaryStage.close();
			}
		});
		
	}
	
	private class Tile extends StackPane
	{
		private Text text = new Text();
		
		public Tile()
		{
			Rectangle border = new Rectangle(200, 200);
			border.setFill(Color.BLACK);
			border.setStroke(Color.WHITE);
			border.setStrokeWidth(5);
			
			text.setFont(Font.font(70));
			
			setAlignment(Pos.CENTER);
			getChildren().addAll(border, text);
			
			setOnMouseClicked(event -> 
			{
				if(!playable)
					return;
				
					if(turnX)
					{
						drawsX();
						turnX = false;
						checkStateForX();
					}
					else if(!turnX)
					{
						drawsO();
						turnX = true;
						checkStateForY();
					}
					else if(!playable)
					{
						checkStateForD();
					}
					
			});

		}
		
		public double getCenterX()
		{
			return getTranslateX() + 100;
		}
		
		public double getCenterY()
		{
			return getTranslateY() + 100;
		}
		
		public String getValue()
		{
			return text.getText();
		}
		
		
		private void drawsX()
		{
			text.setText("X");
			text.setFill(Color.CYAN);
		}
		private void drawsO()
		{
			text.setText("O");
			text.setFill(Color.PINK);
		}
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}
