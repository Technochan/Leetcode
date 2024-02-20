package Leetcode;

public class leetcode410 {
	public static void main(String[] args) {
		int nums[] = {7,2,5,10,8};
		int k = 2;
		int res = splitArray(nums, k);
		System.out.println(res);
	}
	

	public static int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        
        for(int i=0 ; i < nums.length ; i++)
        {
        	left = Math.max(left, nums[i]);
        	right += nums[i];
        }
        
        while(left < right)
        {
        	int mid = left + (right - left) / 2 ;
        	
        	int total = 0;
        	int arrayCount = 1;
        	
        	for(int element : nums)
        	{
        		if(total + element > mid)
        		{
        			total = element;
        			arrayCount++;
        		}else {
        			total += element;
        		}
        	}
        	
        	if(arrayCount > k) {
        		left = mid+1;
        	}else {
        		right = mid;
        	}
        }
        
        return left;
    }
}
