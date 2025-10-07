package strings;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Check if two strings are anagrams
		
		String s1="Spar";
		String s2="Rasp";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()) {
			
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
				
			Arrays.sort(ch1);
			Arrays.sort(ch2);
				
			boolean b=Arrays.equals(ch1, ch2);
			if(b) {					
				System.out.print("Anagram");
			}else {
				System.out.print("Not anagram");
			}
		}else {
			System.out.print("Not anagram as length is not same");
		}
		
	}

}
/*
Output:
Anagram
  */
