package competitiveprogramming;

import java.util.Scanner;

public class SachinAndVarun {
	static class Triplet{
		int gcd ;
		int x;
		int y;
	}
	
	public static Triplet gcdExtendedEuclid(int a, int b)
	{
		if(b == 0)
		{
			Triplet myAns = new Triplet();
			myAns.gcd = a;
			myAns.x = 1;
			myAns.y = 0;
			
			return myAns;
		}
		Triplet smallAns = gcdExtendedEuclid(b, a%b);
		Triplet myAns = new Triplet();
		myAns.gcd = smallAns.gcd;
		myAns.x = smallAns.y;
		myAns.y = smallAns.x - (a/b)*smallAns.y;
		
		return myAns;
		
	}
	public static int gcd(int a, int b)
	{
		if(a < b)
			return gcd(b, a);
		if(b==0)
			return a;
		else
		return gcd(b, a%b);	
	}
	public static int modInverse(int a, int m)
	{
		Triplet t = gcdExtendedEuclid(a, m);
	    
		return ((t.x%m)+m)%m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner sc = new Scanner(System.in);
	     
	     int test = sc.nextInt();
	     
	     while(test-->0)
	     {
	    	 int a = sc.nextInt();
	    	 int b = sc.nextInt();
	    	 int d = sc.nextInt();
	    	 
	    	 
	    	 int g = gcd(a, b);
	    	 
	    	 if(d%g!=0) {
	    		 System.out.println("0");
	    		 continue;
	    	 }
	    	 if(d==0)
	    	 {
	    		 System.out.println("1");
	    		 continue;
	    	 }
	    	 
	    	 int y = ((d%a) * modInverse(b, a))%a;
	    	 a /=g;
	    	 b /=g;
	    	 d /=g;
	    	 
	    	 if(d<y/b)
	    	 {
	    		 System.out.println(0);
	    		 continue;
	    	 }
	    	 
	    	 int firstvalue = d/b;
	    	 
	    	 int n = (firstvalue - y)%a;
	    	 
	    	 int ans = n+1;
	    	 System.out.println(ans);
	    	 	 
	     }
	     

	}

}
