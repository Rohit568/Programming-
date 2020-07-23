package competitiveprogramming;



public class ModInverse {
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
		public static void modeinverse(int a, int m)
		{
			Triplet t = gcdExtendedEuclid(a, m);
			System.out.println(t.x);
			
		}
		
		public static void main(String args[])
		{
			modeinverse(5, 7);
			
		}
}
