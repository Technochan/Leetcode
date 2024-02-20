package Leetcode;import java.util.Arrays;

public class leetcode451 {
	public static void main(String[] args) {
		String str = "ttrvevevev";
		String ans = frequencySort(str);
		System.out.println(ans);
	}
	    
	  public static  String frequencySort(String s) {
	       char[] str=s.toCharArray();
	       
	       int[] freq=new int[128];
	        // for(char ch:s) freq[ch]++;
	        for(int i=0;i<str.length;i++) freq[str[i]]++;
	        
	        
	        for(int i=0;i<str.length;)
	        {
	            char cmax=',';
	            for(int j=0;j<128;j++)
	            {
	                if(freq[j]>freq[cmax]) cmax=(char)j;
	            }
	            while(freq[cmax]!=0){
	                str[i++]=cmax;
	                freq[cmax]--;
	            }
	        }
	   return new String(str);
	}
	  
	 
}
