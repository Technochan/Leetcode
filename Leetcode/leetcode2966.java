package Leetcode;
import java.util.*;
public class leetcode2966 {
	public static void main(String[] args) {
		int arr[] = {17,15,20,16,15,10,20,19,17};
		int k = 2;
		int[][] ans = divideArray(arr,k);
		for(int i=0 ; i<ans.length ; i++) {
			for(int j=0 ; j<ans[i].length ; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
	
    static int[][] divideArray(int[] nums, int k) {
    	
        if(nums.length % 3 != 0) {
        	return new int[0][0] ;
        }
        
        Arrays.sort(nums);
        
        if(nums[nums.length-1] - nums[nums.length-2] > k ) {
        	return new int[0][0];
        }
        int colSize = nums.length/3;
        int ans[][] = new int[colSize][3];
    	
   //     System.out.println(Arrays.toString(nums));
        int index = 0;
        int val = 0;
        for(int i=0 ; i<nums.length ;) {
        	if(nums[i+2] - nums[i] <= k) {
        	//	System.out.println(nums[i+2]+ " "+ nums[i] +" Index" + index +" Val" + val );
        		for(int x=index ; x<index+1 ; x++) {
        			for(int y=0 ; y<3 ; y++) {
        				ans[x][y] = nums[val++];
        			}
        		}
        	} else {
        		return new int[0][0];
        	}
        	i = i+3;
        	index++;
        }     
        
        return ans;
    }
}

