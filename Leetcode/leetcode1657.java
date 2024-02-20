package Leetcode;

import java.util.Arrays;

public class leetcode1657 {
	public static void main(String[] args) {
		String word1 = "cabbba", word2 = "abbccc";
		boolean ans = closeStrings(word1,  word2);
		System.out.println(ans);
	}
	public static boolean closeStrings(String word1, String word2) {
		
		if(word1.length() != word2.length()) return false;
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for(char c : word1.toCharArray())
			arr1[c - 'a']++;
		
		for(char c : word2.toCharArray())
			arr2[c - 'a']++;
		
		for(int i=0 ; i<arr1.length ; i++) {
			if((arr1[i]==0 && arr2[i] !=0) ||(arr1[i]!=0 && arr2[i] ==0) )
				return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0 ; i<arr1.length ; i++) {
			if(arr1[i] != arr2[i])
				return false;
		}
		
        return true;
    }
	
}
