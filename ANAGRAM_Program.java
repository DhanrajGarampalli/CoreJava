package array_concepts;

import java.util.Arrays;

public class ANAGRAM_Program {
	public static void main(String[] args) {
		
		/*String s1 = "aRm";
		String s2 = "Ram";
		
		char c1[]=		s1.toCharArray(); //First convert to Array character.
		char c2[]=		s2.toCharArray();
			
		       Arrays.sort(c1); //Sort Array.
		       Arrays.sort(c2);
		       
		 boolean b1=   Arrays.equals(c1, c2); //Check Arrays equals or not.
		 
		 if(b1==true) 
		 {
			 System.out.println("The given string is Anagram.");
		 }else
		 {
			 System.out.println("The given string is not Anagram.");
		 }
		*/
		
		
		String a="raj";
		String b="jar";
		
		char c[]=	a.toCharArray();
		char c1[]=	b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c);
		
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c));
		
			boolean b1 = Arrays.equals(c, c1);
			if( b1 ==true)
			{
			System.out.println("Given string is anagram");	
			}else
			{
				System.out.println("Given string is not anagram");
			}
		
	}

}
