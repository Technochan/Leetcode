package Leetcode;

import java.util.Arrays;

public class leetcode287 {
	public static void main(String[] args) {
		int arr[] = {3,1,3,4,2};
		int ans = findDuplicate(arr);
		System.out.println(ans);
		
	}
	//cycle sort
	public static int findDuplicate(int[] nums) 	
	{
		int i=0;
		while(i < nums.length)
		{
            if(nums[i] != i+1)
            {
		    	int correct = nums[i] - 1;
		    	if(nums[i] != nums[correct]) {
		        	swap(nums,i,correct);
                }
		        else {
				    return nums[i];
                }
			}
            else
               i++;
		}
		return -1;
	}
	public static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	// else try this
	public static int findDuplicates(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        System.out.println(Arrays.toString(arr));
        for(int i:nums){
            if(arr[i]) return i;
            arr[i] = true;
        }
        return -1;
    }
}
