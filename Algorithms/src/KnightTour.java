//http://www.csegeek.com/csegeek/view/tutorials/algorithms/backtrack/backtrack_part3.php




public class KnightTour {

	private static final int N=8;
	private int sol[][];
	
	public KnightTour()
	{
		sol = new int[N][N];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KnightTour knightTour = new KnightTour();
		knightTour.solveKnightTour();

	}

	private boolean solveKnightTour() {
		// TODO Auto-generated method stub
		
		for(int x=0;x<N;x++)
		{
			for(int y=0;y<N;y++)
			{
				sol[x][y] = -1; 
				System.out.print(" "+sol[x][y]);
			}
			System.out.println();
		}
		
	
		
		// all possible moves that knight can take
		int xMove[] = {2,1,-1,-2,-2,-1,1,2};
		int yMove[] = {1,2,2,1,-1,-2,-2,-1};
		
		/*int xMove[] = {2,1,-1,-2};
		int yMove[] = {1,2,2,1};*/
		
		// knight tour starts from coordinate (0,0)
		sol[0][0]=0;
		
		/*find a possible knight tour using a recursive function
		    starting from sol[0][0] */
		if(!solveKTUtil(0,0,1,xMove,yMove))
				return false;
		else 
			printSolution();
			
			
				
		return true;
		
	}

	private void printSolution() {
		// TODO Auto-generated method stub
		
		for(int x=0;x<N;x++)
		{
			for(int y=0;y<N;y++)
			{
				//System.out.print(" " + sol[x][y]);
			}
			//System.out.println();
		}
		
	}

	private boolean solveKTUtil(int x, int y, int moveCount, int[] xMove, int[] yMove) {
		// TODO Auto-generated method stub
		
		int next_x;
		int next_y;
		
		/* Knight tour is completed :: all cells on the
	       chess board has been visited by knight once*/
		
		if(moveCount==N*N)
			return true;
		
		//System.out.println("N Value" +  " " + N);
		
		for(int i=0;i<2;i++)
		{
			 // get the next move
			next_x = x + xMove[i];
			next_y = y + yMove[i]; 
			
			System.out.println(" " + next_x  + " " + next_y);
			
			if(isSafe(next_x,next_y))
			{
				 // if the move is possible
		         // increment the move count and store it in tour matrix
				sol[next_x][next_y] = moveCount;
				if( solveKTUtil(next_x, next_y,moveCount+1, xMove,  yMove))
					return true;
				else 
					 // this move was invalid, try out other possiblities
					sol[next_x][next_y] = -1;
			}
		}
			
		return false;
	}

	private boolean isSafe(int x, int y) {
		
		// check if the next move (as per knight's constraints) is possible
		if(x >= 0  && x < N && y >= 0 && y < N && sol[x][y] ==-1)
			return true;
		
		
		return false;
	}

}
