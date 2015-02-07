import java.util.Arrays;


public class CoinChange {

	int arr[];
	
	public CoinChange(int sum)
	{
		 arr = new int[] {1,2,3};
		 int arraySize =  arr.length;
		 System.out.println(countCoins(arr, arraySize, sum));
		 
	}
	
	
	
	private int countCoins(int[] coinArray, int arraySize, int sumofCoin) 
	{
		int table[] = new int[sumofCoin + 1];
		
		Arrays.fill(table, 0);
		table[0]=1;
		
		for(int i=0;i<sumofCoin;i++)
			System.out.println("Initial Array Value"+table[i]);
		
		for(int i=0;i<arraySize;i++)
			System.out.println("Coin Array Value"+ coinArray[i]); 
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=coinArray[i];j<=sumofCoin;j++)
			{
				table[j] = table[j] + table[j-coinArray[i]];
				System.out.println("Inner Loop"+ table[j] + " " + j);
			}
		}
		
		for(int i=0;i<sumofCoin;i++)
			System.out.println("Array Value"+table[i]);
		
		//System.out.println("Sum of coin"+sumofCoin);
		return table[sumofCoin];
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CoinChange coinChange = new CoinChange(5);
		
		
	}

}
