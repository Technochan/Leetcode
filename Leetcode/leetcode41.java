package Leetcode;

import java.util.Arrays;

public class leetcode41 {
	public static void main(String[] args) {
		int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
		int ans = firstMissingPositive(arr);
		System.out.println(ans);
	}
	public static int firstMissingPositive(int[] nums)
	{
        int i=0;
		
		while(i < nums.length)
		{
			int correct = nums[i]-1; // -1
			if( nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) 
			{
				swap(nums,i,correct);
			}else {
				i++;
			}
			
		}
		System.out.println(Arrays.toString(nums));
		int j=0;
		while(j<nums.length) 
		{
			if(nums[j] != j+1)
				return j+1;
            else
     			j++;
		}
		return j+1;
    }	
	
	public static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
