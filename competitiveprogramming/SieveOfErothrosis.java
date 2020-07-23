package competitiveprogramming;

public class SieveOfErothrosis {

	
	public static int makeSieve(int n) {
		
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
		int count = 0;
		
		for(int i=0; i<=n; i++)
		{
			if(isPrime[i] == true)
				count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(makeSieve(100));

	}

}
