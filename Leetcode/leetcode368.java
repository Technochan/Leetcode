package Leetcode;
import java.util.*;

public class leetcode368 {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,6,9,15,18,30};
		List<Integer> ans = largestDivisibleSubset(num);
		System.out.println(ans);
	}
	    public static  List<Integer> largestDivisibleSubset(int[] nums) {
	        int n = nums.length;
	        int[] dp = new int[n];
	        Arrays.fill(dp, 1);
	        Arrays.sort(nums);
	        
	        int maxSize = 1, maxIndex = 0;
	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (nums[i] % nums[j] == 0) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                    System.out.println( dp[i] +" "+ dp[j] + 1);
	                    if (dp[i] > maxSize) {
	                        maxSize = dp[i];
	                        maxIndex = i;
	                    }
	                }
	            }
	        }
	        System.out.println(maxSize+ " "+maxIndex);
	        System.out.println(Arrays.toString(nums));
	        System.out.println(Arrays.toString(dp));
	        System.out.println();
	        List<Integer> result = new ArrayList<>();
	        int num = nums[maxIndex];
	        for (int i = maxIndex; i >= 0; i--) {
	        	System.out.println(num+" "+nums[i] + "    "+dp[i] +" "+ maxSize);
	            if (num % nums[i] == 0 && dp[i] == maxSize) {
	                result.add(nums[i]);
	                num = nums[i];
	                maxSize--;
	            }
	        }
	        
	        return result;
	    }
	

}
