package Leetcode;

public class leetcode852_and_162{
	public static void main(String[] args) {
		int arr[] = {0,1,2,0};
		int peekIndex = peakIndexInMountainArray(arr);
		System.out.println(peekIndex);
	}
	public static int peakIndexInMountainArray(int[] arr) {
	        int left = 0 , right = arr.length-1;
	        while(left < right)
	        {
	        	int mid  = left + (right - left)/2;
	        	
	        	if(arr[mid] > arr[mid+1])
	        		right = mid;
	        	else
	          		left = mid+1;
	        } 
	        return left;
    }
}
