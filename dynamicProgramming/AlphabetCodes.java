package dynamicProgramming;

import java.util.Scanner;

public class AlphabetCodes {
	
	
	public static int countSolution(int a[], int size)
	{
		if(size == 1)
			return 1;
		if(size == 0)
			return 1;
		int output = countSolution(a, size -1);
		
		if(a[size-2]*10 + a[size-1] < 26)
			 output += countSolution(a, size -2);
			
		return output;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		int ans[] = new int[n+1];
		
		System.out.println(countSolution(a, n));
		
		System.out.println(countdynamically(a, n , ans));
		
		System.out.println(countiteratively(a, n));
		
		

	}

	private static int countdynamically(int[] a, int n, int[] ans) {
		// TODO Auto-generated method stub
		
		if(n == 0 || n == 1)
			return 1;
		
		if(ans[n]>0)
			return ans[n];
		
		
		int output = countdynamically(a, n-1, ans);
		
		if(a[n-2]*10 + a[n-1] <26)
			output = output + countdynamically(a, n-2, ans);
		
		ans[n] = output;
		
		return output;
		
		
	}
	
	private static int countiteratively(int a[], int n)
	{
		
		int ans[] = new int[n+1];
		
		ans[0] = 1;
		ans[1] = 1;
		
		for(int i=2; i<=n; i++)
		{
			ans[i] = ans[i-1];
			
			if(a[i-2]*10 + a[i-1] <= 26)
				ans[i] = ans[i] + ans[i-2];
				
		}
	    return ans[n];
	}

}
