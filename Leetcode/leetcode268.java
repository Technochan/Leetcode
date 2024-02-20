package Leetcode;

import java.util.Arrays;

public class leetcode268 {
	public static void main(String[] args) {
		int[] arr = {9,6,4,2,3,5,7,0,1};
		int miss = missingNumber(arr);
		System.out.println(miss);
	}
	
	public static int missingNumber(int[] nums)
	{
        int i=0;		
		while(i < nums.length)
		{
			if(nums[i] < nums.length && nums[i] != nums[nums[i]] ) 
				swap(nums,i,nums[i]);
			else 
				i++;		
		}
		for(int j=0 ; j<nums.length ; j++) {
			if(j != nums[j])
				return j;
		}
		
		return nums.length;
		
	}
	public static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
