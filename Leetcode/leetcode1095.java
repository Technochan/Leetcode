package Leetcode;

import java.util.ArrayList;

public class leetcode1095
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(3);
		a1.add(1);
		int target = 3;
		int ans = find(a1,target);
		System.out.println(ans);
		
	}

	public int findInMountainArray(int target, MountainArray mountainArr)
    {
       int peek = peakIndexInMountainArray(mountainArr,target);
		int firstTry = BinarySearchASE(mountainArr,0,peek,target);
		if(firstTry != -1)
			return firstTry;
		
		int secondTry = BinarySearchDESC(mountainArr,peek,mountainArr.length() - 1,target);
		return secondTry;
   }
   public static int peakIndexInMountainArray(MountainArray arr,int target) 
	{
       int left = 0 , right = arr.length() - 1;
       while(left < right)
       {
       	int mid  = left + (right - left)/2;
       	
       	if(arr.get(mid) > arr.get(mid+1))
       		right = mid;
       	else
         		left = mid+1;
       } 
       
      return left;
   }
	
	public static int BinarySearchASE(MountainArray arr , int left,int right,int target) 
	{
		while(left <= right) {
			int mid = left+(right - left)/2;
			
			if(arr.get(mid) == target)
				return mid;
			
			if(arr.get(mid) > target)
				right = mid-1;
			else
				left = mid+1;
		}
		
		return -1;
	}
	public static int BinarySearchDESC(MountainArray arr , int left,int right,int target) 
	{
		while(left <= right) {
			int mid = left+(right - left)/2;
			
			if(arr.get(mid) == target)
				return mid;
			
			if(arr.get(mid) > target)
				left = mid+1;
			else
				right = mid-1;
		}
		
		return -1;
	}
}
