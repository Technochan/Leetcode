package Leetcode;

import java.util.Arrays;

public class leetcode34 {
	public static void main(String[] args) {
		int[] nums = {1};
		int target = 1;
		int[] res = searchRange(nums,target);
		System.out.println(Arrays.toString(res));
	}
	    public static int[] searchRange(int[] nums, int target) {
	        int[] ans={-1,-1};
	        ans[0]=search(nums,target,true);
	        ans[1]=search(nums,target,false);
	        return ans;
	    }

	    static int search(int[] nums, int target, boolean findStartIndex)
	    {
	        int ans=-1,start=0,end=nums.length-1;
	        while(start<=end)
	        {
	            int mid=start+(end-start)/2;

	            if(target<nums[mid])
	                end=mid-1;
	            else if(target>nums[mid])
	                start=mid+1;
	            else
	            {
	                ans=mid;
	                if(findStartIndex)
	                    end=mid-1;
	                else
	                    start=mid+1;
	            }

	        }
	        return ans;
	    }
	}

