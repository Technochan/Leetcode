package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode442 {
	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		List<Integer> ans = findDuplicates(nums);
		System.out.println(ans);
	}
	//cycle sort
	public static List<Integer> findDuplicates(int[] nums)
	{
		List<Integer> missing = new ArrayList<Integer>();
		
        int i=0;		
		while(i < nums.length)
		{
			int correct = nums[i] - 1;
			if(nums[i] != nums[correct]) 
			{
				swap(nums,i,correct);
			}else {
				i++;
			}	
		}

		for(int j=0 ; j<nums.length ; j++) {
			if(j+1 != nums[j])
				 missing.add(nums[j]);
		}
		
	   return missing;		
	}
	public static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	//else try this
	public List<Integer> findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
            list.add(index+1);
            else
            nums[index] = nums[index] * -1;
        }
        return list;
    }
}
