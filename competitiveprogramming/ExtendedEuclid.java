package competitiveprogramming;

public class ExtendedEuclid {
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

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println(gcd(60, 20));
			
			Triplet t= gcdExtendedEuclid(16,10 );
			System.out.println(t.gcd+" "+t.x+" "+ t.y);
			
			

		

	}
}
