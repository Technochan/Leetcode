package Leetcode;

import java.util.Arrays;

public class leetcode739 {
	public static void main(String[] args) {
		int arr[] = {30,40,50,60};
		
		int ans[] = new int[arr.length];
		int index = 0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(i == arr.length-1) {
				ans[index] = 0;
			} else {
				int count = 0;
				if(arr[i] < arr[i+1]) {
					count ++;
					ans[index] = count;
					index++;
				} else {
					int check = i;
					boolean notFound = true;
					while(check < arr.length-1) {
						if(arr[i] < arr[check+1]) {
							ans[index] = (check-i)+1;
							notFound = false;
							break;
						} else {
							check++;
						}
					}
					if(notFound == true) {
						ans[index] = 0;
					}
					index++;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	
	// haven't checked yet, seems unnecessarily complicated


	    public int[] dailyTemperatures(int[] temperatures) {

	        int n = temperatures.length;
	        
	        int hottest = 0;
	        
	        int answer[] = new int[n];
	        
	        for (int currDay = n - 1; currDay >= 0; currDay--) {

	            int currentTemp = temperatures[currDay];

	            // hottest temp seen so far moving from the right
	            if (currentTemp >= hottest) {
	                hottest = currentTemp;
	                continue;
	            }
	            
	            int days = 1;

	            while (temperatures[currDay + days] <= currentTemp) {
	                // Use information from answer to search for the next warmer day
	                days += answer[currDay + days];
	            }

	            answer[currDay] = days;
	        }
	        
	        return answer;
	    
	}
}
