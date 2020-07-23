package geeskforgeeks;

import java.util.PriorityQueue;

public class KthLargestElementInTheStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int A[] = {1, 3, 4, 8, 3, 5, 9, 20, 2, 49};
		
		int n = A.length;
		
		int k = 4;
		
		for(int i=0; i<k-1; i++)
		{
			System.out.print("-1 ");
		}
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		for(int i=0; i<k; i++)
			p.add(A[i]);
		
		for(int i=k; i<n; i++)
		{
			System.out.print(p.peek()+" ");
			
			if(p.peek()<A[i]) {
				p.remove();
				p.add(A[i]);
			}
			
			
		}
		System.out.print(p.peek());
		
	}

}
