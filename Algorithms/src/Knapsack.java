
public class Knapsack {
	
	public static void main(String[]  args)
	{
		int val[] = {10,40,30,50};
		int wt[] = {5,4,6,3};
		int wMax = 10;
		
		System.out.println("Maximum Profit:"+func_Knap(val,wt, wMax));
		
	}
	
	public static int  func_Knap(int val[],int wt[],int wMax)
	{
		
		int noItems =  wt.length;
		int[][] matrix  = new int[noItems+1][wMax+1];
		
				
		/*What if the knapsack's capacity is 0.
		   Set all columns at row 0 to be 0*/
			for(int col=0;col <= wMax ;  col++)
				matrix[0][col]=0;
			
			/*What if there are no items at home. 
			   Fill the first row with 0*/
			for(int row = 0 ; row <= noItems ;  row++)
				matrix[row][0]=0;
			
			for(int item=1;item  <= noItems; item++)
			{
			for(int weight=1;weight <= wMax; weight++)
		{
			//Is the current items weight less than or equal to running weight
					
		 if(wt[item-1] <= weight)	
		   matrix[item][weight] = Math.max(  val[item-1] + matrix[item-1][weight-wt[item-1]] , matrix[item-1][weight]);
		 
		    else 
		     {
			 /*If the current item's weight is more than the running weight, 
			    just carry forward the value without the current item*/
			 
			 matrix[item][weight]  =  matrix[item-1][weight];
				
			}
					
		}
				
			}
		
			//Printing the matrix
			
			for (int[] rows : matrix) 
			{
			   for (int col : rows) 
			     System.out.format("%5d", col);
			   
			System.out.println("\n");
			}
		

		return matrix[noItems][wMax];
		
	}

}
