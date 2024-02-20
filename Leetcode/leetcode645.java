package Leetcode;

import java.util.Arrays;

public class leetcode645 {
	public static void main(String[] args) {
		int[] nums = {8,7,3,5,3,6,1,4};
		int ans[] = findErrorNums(nums);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] findErrorNums(int[] nums) {
		int i=0;
		while(i < nums.length)
		{
		    int correct = nums[i] - 1;
		    if(nums[i] != nums[correct]) 
		        swap(nums,i,correct);
            else
               i++;
		}
		for(int j=0 ; j<nums.length ; j++) 
		{
			if(nums[j] != j+1) {
				return new int[] {nums[j],j+1};
			
		}
		//System.out.println(Arrays.toString(nums));
		return new int[] {-1,-1};
	}
	public static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
