package geeskforgeeks;

public class LCSrecursion {
	
	public static int LCS(String a, String b, int m,int n)
	{
		if(m == 0 || n==0)
		{
			return 0;
		}
		
		if(a.charAt(m-1)==b.charAt(n-1))
		{
			return 1 + LCS(a, b, m-1, n-1 );
		}
		return 1+Math.max(LCS(a, b, m-1, n), LCS(a, b, m, n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String a  = "Rohit";
		String b  = "Rohit";
		
		System.out.println(LCS(a, b, a.length(), b.length()));
	}

}
