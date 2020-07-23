package projecteular;

import java.util.ArrayList;

public class Que50 {
	public static boolean[] makeSeive(int n){
	boolean isPrime[]= new boolean[n+1];
	for(int i=0;i<n; i++)
	{
		isPrime[i] = true;
	}
	
	isPrime[0] = false;
	isPrime[1] = false;
	
	for(int i=2; i*i<=n; i++)
	{
		if(isPrime[i] == true)
		{
			for(int  j=i*i; j<=n; j+=i)
				isPrime[j] = false;
		}
	}
	
	return isPrime;
	}
	
	
	static int result(boolean prime[],int n)
	{
		
		int res = 0;
		
		int sum = 0;
		int st = 0;
		for(st=2; st<n; st++);
		{
			
			if(prime[st] == true) {
				sum = sum + st;
			
			if(sum < n && prime[sum] == true)
				res = sum;
			}
		}
		
		
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a[] = makeSeive(1000000);
		
		System.out.println(result(a, 100));
		
	}

}
