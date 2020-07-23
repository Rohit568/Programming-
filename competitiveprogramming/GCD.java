package competitiveprogramming;

public class GCD {
	
	public static int gcd(int a, int b)
	{
		if(a < b)
			return gcd(b, a);
		if(b==0)
			return a;
		else
		return gcd(b, a%b);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(gcd(5, 4));

	}

}
