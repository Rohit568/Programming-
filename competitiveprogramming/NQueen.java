package competitiveprogramming;

public class NQueen {
	
	static int count = 0;
	static int board[][] = new int[11][11];
	
	public static boolean isPlaceble(int n, int row, int col)
	{
		for(int i= row-1; i>=0; i--)
		{
			if(board[i][col]==1)
				return false;
		}
		
		
		for(int i = row -1, j = col-1;  i>=0 && j>=0; i--,j--)
		{
			if(board[i][j] == 1)
				return false;
		}
		
		for(int i = row -1, j=col+1; i>=0 && j< n ; i--, j++)
		{
			if(board[i][j] == 1)
				return false;
		}
		
		return true;
	}
	
	
	public static void queenHelper(int n, int row)
	{
		if(row == n)
		{
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++)
					System.out.print(board[i][j]+" ");
			System.out.println();
			}
			
			System.out.println();
			count++;
			return;
		}
		
		for(int j= 0; j<n; j++)
		{
			if(isPlaceble(n, row, j))
			{
				board[row][j] = 1;
				queenHelper(n, row+1);
				board[row][j] = 0;
			}
		}
		
		
	}
	
	
	public static void placeNqueen(int n)
	{
		queenHelper(n, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		placeNqueen(8);
		System.out.println(count);

	}

}
