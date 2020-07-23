package competitiveprogramming;

public class RatMaze {
	
	static int[][] matrix= { 
			{1, 1 ,0},
			{1, 1, 1}, 
			{1, 1, 1}
			}; 
	static int[][] result = new int[3][3];
	static int[] rdir = {1, -1, 0, 0};
	static int[] cdir = {0, 0, 1, -1};
	
	
	public static boolean isPossible(int row, int col)
	{
		if(row>=3 || col>=3 || row < 0 || col< 0)
			return false;
		if(matrix[row][col] == 0)
			return false;
		if(result[row][col] == 1)
			return false;	
		
		return true;
	}
	
	public static void runmaze(int n, int row, int col)
	{
		//result[0][0] =1;
		if(row == n-1 && col == n-1)
		{
			result[row][col] =1;
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.print(result[i][j] + " ");
				}
				
				System.out.println();
			}
			result[row][col] = 0;
		   System.out.println();
			return;
		}
		result[row][col] = 1;
		for(int i= 0; i<4; i++)
		{
		        row = row + rdir[i];
		        col = col + cdir[i];
		        if(isPossible(row,  col))
		        {
		        	runmaze(n, row, col);
		        }
		}
		result[row][col] = 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 runmaze(3, 0, 0);
	 }
   }

