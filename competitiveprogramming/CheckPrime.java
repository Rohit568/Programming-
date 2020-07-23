package competitiveprogramming;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean checkprime(int n)
	{
		int count = 0; 
		for(int i=1; i*i<=n; i++)
		{
		    if(n%i==0) {
		    	if(i*i==n)
		    		count +=1;
		    	else
		    		count +=2;
		    }
		}
		
		if(count==2) {
			return true;
		}
		return false;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int   n =sc.nextInt();
		int count = 0;
		for(int i=1; i<n; i++)
		{
			if(checkprime(i)==true) {
				//System.out.print(i+" ");
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
