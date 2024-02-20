package Leetcode;

public class leetcode1704 {
	public static void main(String[] args) {
		String s = "tEetbOok";
		System.out.println(halvesAreAlike(s));
	}
	public static boolean halvesAreAlike(String s) {
	     String a = s.substring(0, s.length()/2).toLowerCase();
	     String b = s.substring((s.length()/2), s.length()).toLowerCase();
	     int count = 0;
	     for(int i=0 ; i<a.length();i++)
	     {
	    	 if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u')
	    		 count++;
	    	 if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u')
	    		 count--; 
	     }
	     return count == 0 ? true : false;
	}
//	 public boolean halvesAreAlike(String s) {
//	        Set<Character> vowels = new HashSet<>();
//	        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
//	        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
//
//	        int vowelsCount = 0;
//	        int midIndex = s.length() / 2;
//
//	        for (int i = 0; i < midIndex; i++) {
//	            char charA = s.charAt(i);
//	            char charB = s.charAt(midIndex + i);
//	            if (vowels.contains(charA)) vowelsCount++;
//	            if (vowels.contains(charB)) vowelsCount--;
//	        }
//
//	        return vowelsCount == 0;
//	    }
}
