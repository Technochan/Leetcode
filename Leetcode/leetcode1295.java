package Leetcode;

public class leetcode1295 {
	public static void main(String[] args) {
		int[] arr = {10,123,12,1001,421};
		int count = findEven(arr);
		System.out.println(count);
	}
	public static int findEven(int[] arr) {
		int count = 0;
		for(int i : arr) {
			int digit = 0;
			while( i > 0 ) {
				i = i/10;
				digit++;
			}
			count = digit%2 == 0 ? count+1 : count;
		}
		return count;
	}
//	public static int findEven(int[] arr) {
//		int count = 0;
//		
//		for(int i : arr) {
//			if((int)Math.log10(i)%2==1) count++; // Short cut
//		}
//		return count;
//	}
	
}
