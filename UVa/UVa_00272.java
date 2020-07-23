package UVa;

import java.util.Scanner;

public class UVa_00272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int flag = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='\"' && flag == 0)
			{
				System.out.print("``");
				flag   = 1;
			}
			else if(str.charAt(i)=='\"' && flag==1)
			{
				System.out.print("''");
				flag = 0;
			}
			else
				System.out.print(str.charAt(i));
			
		}
		

	}

}
