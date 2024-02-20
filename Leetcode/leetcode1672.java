package Leetcode;

public class leetcode1672 {
	public static void main(String[] args) {
		int[][] accounts = {{1,5},
							{7,3},
							{3,5}};
		
		int max = getMaxWealth(accounts);
		System.out.println(max);
	}
	public static int getMaxWealth(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for(int[] row: arr) {
			int val = 0;
			for(int element : row) {
				val += element;
			}
			max = val >= max ? val : max;
		}
		return max;
	}
}
