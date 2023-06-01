package in.ineuron;

import java.util.Arrays;

public class Second {

	    public int distributeCandies(int[] candyType) {   
	        Arrays.sort(candyType);        
	        int uniqueCandies = 1;
	        for (int i = 1; i < candyType.length && uniqueCandies < candyType.length / 2; i++) {
	            
	            if (candyType[i] != candyType[i - 1]) {
	                uniqueCandies++;
	            }
	        }
	        return Math.min(uniqueCandies, candyType.length / 2);
	    }
	
	public static void main(String[] args) {
		int candyType[] = {1,1,2,2,3,3};
		Second second = new Second();
		int candies = second.distributeCandies(candyType);
		System.out.println(candies);

	}

}
