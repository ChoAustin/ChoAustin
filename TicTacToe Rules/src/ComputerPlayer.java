public class ComputerPlayer extends Board
{
   private int[][] preferredMoves = 
	   {
         {1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2},
         {0, 1}, {1, 0}, {1, 2}, {2, 1}
       };

   private Board board;

   //----- YOUR CODE GOES HERE:
   // ADD A INSTANCE VARIABLE THAT STORES THE GAME SYMBOL ASSIGNED TO THE COMPUTER PLAYER
   
   String CPUmark;
   
   /** Constructor with reference to game board */
   public ComputerPlayer(Board board) 
   {
      this.board = board;
   }
 
 	//----- YOUR CODE GOES HERE:
 	// ADD A SETTTER METHOD FOR THE INSTANCE VARIABLE THAT 
    // STORES THE GAME SYMBOL ASSIGNED TO THE COMPUTER PLAYER
   public void setCPUmark(String CPUmark)
   {
	   CPUmark = "o";
   }
   
   /** Search for the first empty cell, according to the preferences
    *  @return int array of two values [row, col]
    */
   public boolean placeComputerMark(int row, int col) 
   {
	   if((row >= 0) && (row < 3))
	   {
		   if((col >= 0) && (col < 4))
		   {
			   if(board[row][col] == '-')
			   {
				   board[row][col] = CPUmark;
				   return true;
			   }
		   }
	   }
	   return false;
   }
 
public int[] generateMove() 
   {
	     
   		 for (int[] move : preferredMoves) 
   		 {
   		 	 // checks for empty space on board 
   		 	 // (i.e. checks if this "move" is available, if the space is empty its available)
	         if (Board.getBoard()[0][0] == " ") 
	         {
	            Board.placeComputerMark(0, 0);
	         }
         }

         return null;
   }
}