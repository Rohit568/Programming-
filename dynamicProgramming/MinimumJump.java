package dynamicProgramming;

public class MinimumJump {
	
	public static int findSolution(int A[], int i, int n,int lookup[])
	{
			
		if(i==n-1)
			return 0;
		
		if(i>= n &&  A[i] == 0)
			return Integer.MAX_VALUE;
	
		
		int minimumCost = Integer.MAX_VALUE;
		
		for(int j = i+1; j< i+ A[i]; j++)
		{
			int cost = findSolution(A, j, n, lookup);
			if(cost!=Integer.MAX_VALUE)
			{
				minimumCost = Math.min(minimumCost,cost + 1);
			}
			
		}
		
		return minimumCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {4, 2, 0, 3, 2, 0, 1, 8};
		int lookup[] = new int[A.length+1];
		int res  = findSolution(A, 0, A.length, lookup);
		System.out.println(res);
		

	}

}
