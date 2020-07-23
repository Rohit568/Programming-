package competitiveprogramming;

import java.util.Scanner;

public class GcdOfBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = sc.nextInt();
		int  t = Moduloof(s, a);
		
		System.out.println(t);

	}

	private static int Moduloof(String s, int a) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i=0; i<s.length(); i++)
		{
			
			int c = s.charAt(i) - '0';
			
//		    l = Integer.parseInt(String.valueOf(c));
//			System.out.println(l);
			
			res = (res*10 + c)%a;
		}
		return res;
	}

}
