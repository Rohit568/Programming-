package dynamicProgramming;

public class MinimumPathCityAtoCityB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int costOfCityAB[][] = { 
				           {0, 25, 20, 10, 125},
				           {20, 0, 15, 3, 4}, 
				           {30, 15, 0, 8, 9}, 
				           {10, 10, 50, 0, 5},
				           {40, 2, 5, 10, 0}
		                  };
		
		System.out.println(findMinimumCost(costOfCityAB));
				           
				           
				           
				           
				
		}

	private static int findMinimumCost(int[][] cost) {
		// TODO Auto-generated method stub
		
	     int minimumCost[] = new int[5];
	     
	     for(int i=0; i<5; i++)
	     minimumCost[i] = cost[0][i];
	     
	     
	     boolean isFalse =false;
	     
	     while(!isFalse) {
	    	 
	    	 isFalse =true;
	     
	     for(int i=0; i<5; i++)
	     {
	    	 for(int j = 0; j<5; j++)
	    	 {
	    		  if(minimumCost[i] > minimumCost[j] + cost[j][i]) {
	    			  minimumCost[i] = minimumCost[j] + cost[j][i];
	    		  isFalse = false;
	    		  }
	    		 
	    		 System.out.print(minimumCost[j]+" ");
	    	 }
	    	 
	    	 System.out.println();
	     
	     
	     }
	     System.out.println();
	     
	    
	    	 
	    }
	     
	     for(int i=0; i<5; i++)
	    	 System.out.print(minimumCost[i]+" ");
	     return minimumCost[5-1];
		

	}

}
