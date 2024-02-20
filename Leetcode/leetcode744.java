package Leetcode;

public class leetcode744 {
	public static void main(String[] args) {
		char[] letters = {'e','e','e','k','q','q','q','v','v','y'};
		char target = 'q';
		char ans = nextGreatestLetter(letters,target);
		System.out.println(ans);
	}
	public static char nextGreatestLetter(char[] letters, char target) {
		 int left = 0 , right = letters.length-1;
	  System.out.println(0 +(5-0)/2);
//	        while(left <= right)
	        {
	        	int mid = left + (right - left)/2;
	        	
	        	if(letters[mid] <= target)
	        		left = mid+1;
	        	else
	        		right = mid-1;
	        }
	        return letters[left % letters.length];
    }
}
