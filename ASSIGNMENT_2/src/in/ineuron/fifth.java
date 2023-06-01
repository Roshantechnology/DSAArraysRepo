package in.ineuron;

import java.util.Arrays;
public class fifth {
	    public int maximumProduct(int[] nums) {
	        Arrays.sort(nums);
	        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
	    }	
	public static void main(String[] args) {
		int nums[] ={1,2,3};
		
		fifth fifth = new fifth();
		int maximumProduct = fifth.maximumProduct(nums);
		System.out.println(maximumProduct);
	}

}
