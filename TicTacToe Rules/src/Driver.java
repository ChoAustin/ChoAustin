import java.util.*;
public class Driver 
{
	public static void main(String[] args) throws StringNotAcceptedException, IllegalMoveException
	{	
		Board board = new Board("x");
		ComputerPlayer computer = new ComputerPlayer(board);
		Game game = new Game(computer);
		
		game.play();
	}
}
