
// Following code:
// http://www.java.achchuthan.org/2012/02/n-queens-problem-in-java.html




public class NQueen {

	
	int[] x;
	
	public NQueen(int N) {
		
		
		x= new int[N];
	}

	public void method()
	{
		placeNQueen(0,x.length);
		
	}
	
	// BackTracking 
	private void placeNQueen(int row, int N) {
		
		for(int column=0; column<N; column++)
		{
			if(isSafe(row,column))
			{
				x[row] = column;
				
				if(row == N-1) // we are done here 
					printNQueen(x);
				else
					placeNQueen(row+1, N); // recursively place rest of the Queens
			}
		}
		
		
	}
	
	

	private void printNQueen(int[] x2) {
		// TODO Auto-generated method stub
		
		int N =  x2.length;
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(x[i] == j)
					System.out.print("Q");
				else 
					System.out.print("*");
					
			}
			System.out.println();
			
		}
		System.out.println();
		
	}

	
	// Method to check present row and columns are safe to place on the chessboard
	private boolean isSafe(int row, int column) 
	{
		for(int i=0;i<row;i++)
		{
			if(x[i] == column) // Same Column
				return false;
			
			if(i-row == x[i] -column || i-row == column-x[i]) // Same Diagonal
				return false;
				
		}
		
		
		
		
		return true;
	}

	public static void main(String[] args) 
	{
		
		// Constructor of NQueen and 4*4 chessBoard
		NQueen refVar = new NQueen(4);
		refVar.method();

	}

}
