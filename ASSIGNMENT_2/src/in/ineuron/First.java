package in.ineuron;

import java.util.Arrays;

public class First {
	    public int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum = 0;
	        for(int i = 0 ; i < nums.length-1; i= i+2){
	            sum = sum+ Math.min(nums[i],nums[i+1]);
	        }
	        return sum;
	    }
	
	public static void main(String[] args) {
	int nums[] = {1,4,3,2};
	First first = new First();
	int arrayPairSum = first.arrayPairSum(nums);
	System.out.println(arrayPairSum);	
	}

}
