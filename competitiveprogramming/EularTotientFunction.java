package competitiveprogramming;

public class EularTotientFunction {
	
	static void function(int n)
	{
		int a[] = new int[n+1];
		
		for(int i=1;i<=n; i++) a[i] = i;
		
		for(int i = 2; i*i<=n; i++)
		{
			if(a[i] == i)
			{
				a[i] = i-1;
				for(int j = 2*i; j<=n; j+=i)
				{
					a[j] = (a[j]*(i-1))/i;
				}
			}
		}
		
		for(int i=1; i<=n; i++)
			System.out.print(a[i]+" ");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         function(10);
	}

}
