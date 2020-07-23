package competitiveprogramming;

public class NumberOfBalancedBT {

	public static int BalancedBTs(int h)
	{
		if(h==0 || h==1)
			return 1;
		else
		{
			int x = BalancedBTs(h-1);
			int y = BalancedBTs(h-2);
			
			int m = (int)Math.pow(10, 9)+7;
			long  res1 = (long)x*x;
			long res2 = (long)2*x*y;
			
			int ans1 = (int)(res1%m);
			int ans2 = (int)(res2%m);
			int ans = (ans1+ans2)%m;
			return ans;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		int ans = BalancedBTs(8);
		System.out.println(ans);
	}

}
