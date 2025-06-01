package array_concepts;

import java.util.Arrays;

public class Array_Sorting {
	public static void main(String[] args) {
		
		String name="dhanraj";
		char c2[]=		name.toCharArray();//Convert String into charArray.
				
		//Print Array
		System.out.println(Arrays.toString(c2));
				
		Arrays.sort(c2);
		
		 //Print Array
		System.out.println(Arrays.toString(c2));
		
		
		
		//or
		char c1[] = name.toCharArray(); //Convert String into char.
		System.out.println(c1);
		
		 Arrays.sort(c1); // Sort char and print.
		 System.out.println(c1);
		 
		 /*
		System.out.println(Arrays.toString(c1)); //Convert char to ArraystoString 
		
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		
		  */
		 
		 int a[]= new int[5];
		 a[0]= 10;
		 a[1]= 50;
		 a[2]= 70;
		 a[3]= 80;
		 a[4]= 20;
		 
		 int b[]= {20,56,48,79,100,75,100};
		 Arrays.sort(b);
		 Arrays.sort(a);
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
		 }
	
	

}
