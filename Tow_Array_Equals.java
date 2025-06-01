
package array_concepts;

import java.util.Arrays;

public class Tow_Array_Equals {
	public static void main(String[] args) {
		/*
		int a[]= new int[2];//int Array 1.
		
		a[0] =0;
		a[1] =0;
		
		int a1[]= new int[2];//int Array 2.
		
		a1[0] =0;
		a1[1] =0;
	
		boolean b1 = Arrays.equals(a, a1);//Compare both array 1 and 2.
		System.out.println(b1);
		
		String name[] = new String[1];//String Array 1.
		name[0]="dhanraj";
		
		String name1[]= new String[1];//String Array 2.
		name1[0]="dhanraj";
		
		boolean b2 = Arrays.equals(name1, name);//Compare both String array 1 and 2.
		System.out.println(b2);
		*/
		
		
		
		int a[] = new int[2];
		a[0]= 10;
		a[1]= 20;
		int a1[] = new int[2];
		a1[0]= 10;
		a1[1]= 20;
		
		boolean b1=	Arrays.equals(a1, a);
		System.out.println(b1);
		
		String s[] = new String[2];
		s[0] = "Raj";
		s[1]="Raj1";
		
		String s1[] = new String[2];
		s1[0]="Raj";
		s1[1]="Raj1";
		
	boolean b2 =Arrays.equals(s1, s);
	System.out.println(b2);
	}
	

}
