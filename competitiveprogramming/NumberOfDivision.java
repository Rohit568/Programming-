package competitiveprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfDivision {
	
	public static ArrayList<Integer> sieve()
	{
		int max = 500000;
		ArrayList<Integer> list = new ArrayList<>();
		
		boolean isPrime[] = new boolean[500000+1];
		
		for(int i=2; i<max; i++)
		{
			isPrime[i] = true;
		}
		
		
		for(int i=2; i*i<max; i++)
		{
		    if(isPrime[i] == true)
		    {
		    	for(int j=i*i; j<=max; j+=i)
		    		isPrime[j] = false;
		    }
		}
		
		list.add(2);
		
		for(int i=3; i<max; i+=2)
		{
			if(isPrime[i] == true)
				list.add(i);
		}
		
		return list;
	}
	
	public static long divisor(int n, ArrayList<Integer> list) {
		long mod  = 1000000007;
		
		long result = 1;
		for(int i=0; list.get(i)<n; i++)
		{

			long k = list.get(i);
			long count = 0;
			while((n/k)!=0)
			{
				  count = (count + n/k)%mod;
				  k = k*list.get(i);
			}
			
			result = (result*(count+1)%mod)%mod;
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> prime = sieve();
		
		long ans = divisor(n, prime);
		
		System.out.println(ans);
		
		
		
	}

}
