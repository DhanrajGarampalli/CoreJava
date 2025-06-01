package array_concepts;

import java.util.Arrays;

public class FindingSpaceDigitLetters {
	public static void main(String[] args) {
		int countOfLetter=0;
		int countOfDigits=0;
		int countOfSpace=0;
		int countOfLowerCase=0;
		int countOfUpperCase=0;
		
		String s1 = "Dhanraj soma TEST @ 12345..:";
		
		int a= s1.length();//Finding total length of String.
		System.out.println("String Length count"+a);
		
		char c3[]=	s1.toCharArray();
		int c2=	c3.length;//Finding total length of Array.
		System.out.println("Array Length count"+c2);
		
		
		
		//Finding Letters***************************
		char c1[]=	s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		   
		for(int i=0; i<c1.length;i++)
		{
		boolean b1=	Character.isLetter(c1[i]);
		//System.out.println(b1);
		if(b1==true)
		{
			countOfLetter++;
		}
		}System.out.println("Count of Letters are:-"+countOfLetter);
		
		//Finding Digits***************************
		
			for(int i=0; i<s1.length(); i++)
			{
			boolean b2=	Character.isDigit(c1[i]);
			//System.out.println(b2);
			if(b2==true)
			{
				countOfDigits++;
			}
			}System.out.println("Count of Digits:-"+countOfDigits);
		
		//Finding Spaces***************************
			for(int i=0; i<s1.length(); i++)
			{
			boolean b3= Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				countOfSpace++;
			}
			}System.out.println("Count of Spaces:-"+countOfSpace);
			
			//Finding lower case letter count.
			for(int i=0; i<s1.length(); i++)
			{
			boolean b4= Character.isLowerCase(c1[i]);
			if(b4==true)
			{
				countOfLowerCase++;
			}
			}System.out.println("Count of Lower Case:-"+countOfLowerCase);
			
			//Finding lower case letter count.
			for(int i=0; i<s1.length(); i++)
			{
			boolean b5= Character.isUpperCase(c1[i]);
			if(b5==true)
			{
				countOfUpperCase++;
			}
			}System.out.println("Count of Upper Case:-"+countOfUpperCase);
			
			//Finding Special characters count.
			int a1=s1.length();
			int b=	a1-countOfLetter-countOfDigits-countOfSpace;
			System.out.println("Count of Special Characters are:-"+b);
		}

}
