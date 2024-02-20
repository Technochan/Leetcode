package Leetcode;

public class leetcode1347 {
	public static void main(String[] args) {
		String input1 = "AcdI";
		String input2 = "Idca";
		int steps = minSteps(input1,input2);
		System.out.println(steps);
	}
	public static int minSteps(String s, String t) {
		int count = 0;
		int arr[] = new int[128];
		
		for(int i=0 ; i<s.length(); i++)
			arr[s.charAt(i)]++ ;

		for(int j=0 ; j<t.length() ; j++) {
			if(arr[t.charAt(j)] > 0)
				arr[t.charAt(j)]--;
			else 
				count++;
		}
        return count;
    }
}
