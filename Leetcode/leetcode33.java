package Leetcode;

public class leetcode33 {
	public static void main(String[] args)
	{
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0; 
		int res = search(arr,target);
		System.out.println(res);
	}
	public static int search(int[] nums, int target)
	{
	        int peekIndex = peekIndex(nums);
	        
	        if(peekIndex == -1)
	        	BinarySearch(nums,target,0 , nums.length-1);
	        
	        if(nums[peekIndex] == target)return peekIndex;
	        
	        int ans = BinarySearch(nums,target,peekIndex+1 , nums.length-1) ;
	        
	        return ans != -1 ? ans : BinarySearch(nums,target,0 , peekIndex-1) ;
    }
	static int BinarySearch(int[] arr, int target,int left,int right)
	{
		while(left <= right) 
		{
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == target)
				return mid;
			
			if(arr[mid] > target)
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
	public static int peekIndex(int[] arr)      //    {4,5,6,7,8,9,0,1,2,3};
	{
		int left = 0, right = arr.length-1;
		
		while(left <= right)
		{
			int mid = left + (right - left) / 2;
			
			if(mid < right && arr[mid] > arr[mid+1] )
				return mid;
			if(mid > left && arr[mid] < arr[mid-1])
				return mid-1;
			if(arr[mid] <= arr[left])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
}
