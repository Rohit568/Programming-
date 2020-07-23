package dynamicProgramming;

import java.util.HashMap;

public class CoinChangeProblem {
	
	
	public static int coinchange(int A[], int n, int s, HashMap<String, Integer> map)
	{
		if(s>=A.length)
			return 0;
		if(n == 0)
			return 1;
		if(n<0)
			return 0;
		String key = n+"|"+s;
		
		if(map.containsKey(key))
			return map.get(key);
		int first = coinchange(A, n-A[s], s, map);
		int second =coinchange(A, n, s+1, map);
		map.put(key, first+second);
		return first + second;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = { 3, 7, 10};
		
		int n = 15;
		HashMap<String , Integer> map = new HashMap<>();
		int B[] = new int[A.length +1];
		System.out.println(coinchange(A, n, 0, map));

	}

}
