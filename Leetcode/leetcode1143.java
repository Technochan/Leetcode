package Leetcode;

public class leetcode1143 {
	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "acfe";
		int count = longestCommonSubsequence(text1,text2);
		System.out.println(count);
	}
	
	 public  static int longestCommonSubsequence(String text1, String text2) {
	        // Lengths of the input strings
	        int length1 = text1.length();
	        int length2 = text2.length();
	      
	        // Create a 2D array to store the lengths of longest common subsequences
	        // for all subproblems, initialized with zero
	        int[][] dp = new int[length1 + 1][length2 + 1];
	        print(dp);
	        // Build the dp array from the bottom up
	        for (int i = 1; i <= length1; ++i) {
	            for (int j = 1; j <= length2; ++j) {
	                // If characters match, take diagonal value and add 1
	                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                }
	                // If characters do not match, take the maximum value from 
	                // the left (dp[i][j-1]) or above (dp[i-1][j])
	                else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        print(dp);
	        // The bottom-right cell contains the length of the longest
	        // common subsequence of text1 and text2
	        return dp[length1][length2];
	    }
	 
	 public static void print(int[][] arr) {
		 for(int[] i : arr) {
			 for(int j : i) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	
}
