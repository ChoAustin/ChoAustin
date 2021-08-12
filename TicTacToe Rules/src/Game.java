import java.io.IOException;
import java.util.Scanner;
public class Game implements CheckRules
{
	private ComputerPlayer computerPlayer;
	private String computer, user;
	private Board board;
	Scanner scan = new Scanner(System.in);

	public Game(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
		board = computerPlayer.getBoard();
		user = board.getUserSymbol();
	}
	private void setUser() throws StringNotAcceptedException 
	{
		user = "x";
		board.setUserSymbol(user);
		
		computer = "o";
		board.setComputerSymbol(computer);

	}
	
	private void promptUser() 
	{
		try 
		{
			System.out.println("Enter a number between 1 and 9 (inclusive)");
		
			String input = scan.nextLine();
		
			if(isNumeric(input)) 
			{
				board.playMove(Integer.parseInt(input), user);
			}
			else  
				throw new StringNotAcceptedException("Sorry. Invalid input, try a number!");
			}
		
	}
	
	private static boolean isNumeric(String s) {
		int count=0;
		boolean num = false;
		while(s.length()>count) {
			char c = s.charAt(count);
			 if(Character.isDigit(c)) {
				 num = true;
			 }
			 count++;
		}
		return num;
	}

	private boolean checkDraw() {
		int [] moves = movesMade(board.getBoard(), user);
		GameState state = GameState.DRAW;
		int [][] draw = state.getGameState();
		int count = 0;
		
		for(int i = 0; draw[0].length>i;i++) {
			if(draw[0][i]==moves[i])
				count++;
		}
		if(count==9)
			return true;
		else
			return false;
	}
	
	private boolean checkPlay() 
	{
		if(checkDraw())
			return false;
		
		else if(checkWinX())
			return false;
		
		else if(checkWinO())
			return false;
		
		else 
			return true;
	}
	
	private boolean checkWinO() 
	{
		GameState state = GameState.O_WON;
		int[][] xWin = state.getGameState();
		
		int[] moves = movesMade(board.getBoard(), (computer.equalsIgnoreCase("o")?computer:"x"));
		
		for(int row = 0; row < 8; row++) 
		{
			int count = 0;
			for(int col=0;col < 3;col++) 
			{
				for(int move:moves) 
				{
					if(xWin[row][col]==move)
						count++;
				}
			}
			if(count==3) 
			{
				System.out.println("CPU Victory!");
				return true;
			}
		}
		return false;
	}
	
	private boolean checkWinX() {
		GameState state = GameState.X_WON;
		int[][] xWin = state.getGameState();
		int[] moves = movesMade(board.getBoard(), (user.equalsIgnoreCase("x")?user:"o"));
		
		for(int row = 0; row < 8; row++) 
		{
			int count = 0;
			for(int col=0;col < 3;col++) 
			{
				for(int move:moves) 
				{
					if(xWin[row][col]==move)
						count++;
				}
			}
			if(count==3)
			System.out.print("Victory!");
				return true;
		}
		return false;
	}
	
	
	private int[] movesMade(String[][] board, String letter) 
	{
		int[]moves = new int[9];
		for(int row = 0; row<3; row++) 
		{
			for(int column = 0; column<3;column++) 
			{
				if(board[row][column].equalsIgnoreCase(letter)) 
				{
					switch (row) 
					{
			        case 0:	switch(column) 
			        {
						        case 0: 
						        	moves[0]=1;
						        	System.out.print(1);
						     		break;
						        case 1: 
						        	moves[1]=2;
						        	System.out.print(2);
						     	    break;
						        case 2: 
						        	moves[2]=3;
						        	System.out.print(3);
						        	break;
			        		}
			                break;
			        case 1: switch(column) {
						        case 0: 
						        	moves[3]=4;
						        	System.out.print(4);
						        	break;
						        case 1: 
						        	moves[4]=5;
						        	System.out.print(5);
						        	break;
						        case 2: 
						        	moves[5]=6;
						        	System.out.print(6);
						        	break;
			        		}
			     			break;
			        case 2: switch(column) 
			        {
			        	case 0: 
						moves[6]=7;
						System.out.print(7);
						break;
						    case 1: 
						    moves[7]=8;
						    System.out.print(8);
						    break;
						        case 2: 
						        moves[8]=9;
						        System.out.print(9);
						        break;
			        }
			        break;
			        default:
			        break;
					}
				}
			}
		}
		return moves;
	}
	
	
	public void play() 
	{
		try 
		{
			setUser();
			
			while(checkPlay()) 
			{
			
				promptUser();
				computerPlayer.setMove();
				
				board.printBoard();
				
			}
			if(checkDraw()) {
				System.out.print("Draw!");
			}
			else if(checkWinX())
				System.out.print("Victory!");
			else if(checkWinO()) {
				System.out.println("Computer's Victory!");
				System.out.println("Continue? y/n");
				String input = scan.nextLine();
				
				if(input.equalsIgnoreCase("y"))
					
					play();
			}
			else if(checkWinO()||checkWinX())
				System.out.print("TIE!");
		
		}
		catch(IllegalMoveException ex) 
		{
			System.out.println(ex.getLocalizedMessage());
			play();
		}
		catch (StringNotAcceptedException e) 
		{
			System.out.println(e.getLocalizedMessage());
			
			play();
		}
		

	}

}