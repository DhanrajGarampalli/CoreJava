
package array_concepts;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Order {
 public static void main(String[] args) {
	
	 Integer[] numbers = {5, 2, 8, 1, 9, 4};
	 Arrays.sort(numbers);// Ascending Order.
	 System.out.println(Arrays.toString(numbers));
	 
	 
	 Arrays.sort(numbers, (a,b) -> b-a); //Descending Order.
	 System.out.println(Arrays.toString(numbers));
	 
	 //Sorting Strings in Ascending.
	 String s1[]= new String[4];
			s1[0]= "Dhanraj";
			s1[1]= "Archana";
			s1[2]= "Bindu";
			s1[3]= "Pranita.";
	 
	 		Arrays.sort(s1);
	 System.out.println(Arrays.toString(s1));
	 
	//Sorting Strings in Descending.
	 
	 String s2[]= new String[4];
	 s2[0]= "Dhanraj";
	 s2[1]= "Archana";
	 s2[2]= "Bindu";
	 s2[3]= "Pranita.";
	 Arrays.sort(s2, Collections.reverseOrder());
	 		System.out.println(Arrays.toString(s2));
	 		
	 		
	 
}
	
	
}
