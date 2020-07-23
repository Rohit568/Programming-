package competitiveprogramming;

public class ModularExponenetion {

	
	static int modRecursive(int a, int b, int c)
	{
		if(b==0)
			return 1;
		
		if(b%2==0)
		{
			return modRecursive(a*a%c, b/2, c);
		}
		else
			return ((a%c)*modRecursive(a*a%c, b/2, c))%c;
	}
	
	static int modIterative(int a, int b, int c)
	{
		int res = 1;
		
		for(int i=0; i<b/2; i++)
		{
			if(b%2==1)
			res = a*(res*(a*a)%c)%c;
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Ato-generated method stub
		
		
		System.out.println(modRecursive(6, 55, 13));
		System.out.println(modIterative(6, 55, 13));
		

	}

}
