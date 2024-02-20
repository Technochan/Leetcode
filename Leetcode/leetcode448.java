package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class leetcode448 {
	public static void main(String[] args) {
		int[] arr = {1,2};
		List<Integer> ans = findDisappearedNumbers(arr);
		System.out.println(ans);
	}
	public static List<Integer>  findDisappearedNumbers(int[] nums)
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
				 missing.add(j+1);
		}
		
	   return missing;			
	}
	public static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	// else try this
//	public List<Integer> findDisappearedNumbers(int[] nums) {
//        int[] freq = new int[nums.length + 1];
//        for(int i = 1; i <= nums.length; i++) {
//            freq[i] = 0;
//        }
//        for(int i = 0; i < nums.length; i++) {
//            freq[nums[i]]++;
//        }
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i = 1; i <= nums.length; i++) {
//            if(freq[i] == 0) {
//                result.add(i);
//            }
//        }
//        return result;
//    }
}
