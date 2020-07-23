package dynamicProgramming;

public class makePolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "AABDDSCBAAkljfsjlkjslgjosjohiaASkjglssfhjklgjsjlkjdlhghlsjgl";
		
		char[] c = str.toCharArray();
		int ans[][] = new int[str.length()+1][str.length()+1];
		int res = checkNumber(c, 0, str.length()-1, ans);
		
		
		System.out.print(res);

	}

	private static int checkNumber(char[] c, int i, int j, int ans[][]) {
		// TODO Auto-generated method stub
		
		if(i>j)
		return 0;
	if(ans[i][j] !=0)
		return ans[i][j];
		if(c[i]==c[j])
		{
			return checkNumber(c, i+1, j-1, ans);
		}
		else
		{
			ans[i][j] =  1 + Math.min(checkNumber(c, i+1, j, ans), checkNumber(c, i, j-1,ans));
			return ans[i][j];
		}
		
	}

}
