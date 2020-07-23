package geeskforgeeks;

import java.util.Scanner;

public class MaximuminThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		
		
		int test = sc.nextInt();
		while(test-->0)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			
			if(x!=y && y!=z && z!=x)
				System.out.println("NO");
			else if((x==y && x<z) || (x==z && x<y) || (y==z && y<x))
			{
				System.out.println("NO");
			}else if(x ==y && y== z) {
				System.out.println("YES");
				System.out.println(x + " "+ y +" "+ z);
			}else 
			{
				if(x==y && z < x) {
					System.out.println("YES");
					int a = x;
					int b = 1; 
					int c = z;
					System.out.println(a+" "+b+" "+c);
				}else if(x == z && y<z)
				{
					System.out.println("YES");
					int a = x;
					int b = y;
					int c = 1;
					System.out.println(a+" "+b+" "+c);
				}
				else {
					System.out.println("YES");
					int a = x;
					int b = 1;
					int c = z;
					System.out.println(a+" "+b+" "+c);
			}	
		}

	}

}
}
