package Leetcode;
import java.util.*;
public class leetcode1291 {
	public static void main(String[] args) {
		int low = 234;
		int high = 2314;
		List<Integer> ans = sequentialDigits(low, high);
		System.out.println(ans);
		
	}
	
	static List<Integer> sequentialDigits(int low, int high)
	{
		
	    List<Integer> result = new ArrayList<>();
	    int num[] = {1,2,3,4,5,6,7,8,9};
	    
	    int range = low;
	    int count = 0;
	    
	    while(range > 0) {
	    	range = range/10;
	    	count++;
	    }

	    for(int i=0 ; i<num.length ; i++) {

	    	String val = "";
	    	for(int j = i ; j<count+i ; j++){
	    		if(val.length() == num.length) break;
	    		val += num[j];
	    	}
	    	
	    	int numVal = Integer.parseInt(val);
	    	
	    	if(numVal > high ) {
	    		break;
	    	}
	    
	    	if(numVal >= low ) {
	    		result.add(numVal);
	    	}  
	    
	    	if(num.length - i == count) {
	    		if(val.length() == num.length) break;
	    		i=-1;
	    		count++;	
	    	}
	    	
	    }
	    
	    
	    
//	    int checking = count;
//	    for(int i=0 ; i<num.length ;)
//	    {
//	    	int val = num[i];
//	    	int index = i;
//	    	while(count > 1) {
//	    		val =  val * 10  + num[++index];
//	    		count--;
//	    	}
//	    	
//	    	if(val >= high) {
//	    		break;
//	    	}
//	    	
//	    	if(val > low) {
//	    		result.add(val);
//	    	}
//	    	
//	    	i++;
//	    	count = checking;
//	    	if(num.length - i < count ) {
//	    		i=0;
//	    		count = count+1;
//	    		checking++;
//	    	}
//	    }

	    return result;
	        
    }
}
