package array_concepts;
import java.util.*;
public class Array_withScanner_Class {

	public static void main(String[] args) {
		
		/*int a[]= new int[5];
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<=4; i++)
		{
			a[i]= s.nextInt();
		}
		
	/*  a[0]= s.nextInt();//Instead of this we are using for loop to get the input.
		a[1]= s.nextInt();
		a[2]= s.nextInt();
		a[3]= s.nextInt();
		a[4]= s.nextInt();
	*/
		/*
		for (int i =0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		*/
		/*System.out.println(a[0]);//Instead of this we are using for loop to get the output.
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
		*/
		
		
		int a[]= new int[5];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<=4; i++)
		{
			a[i]=s.nextInt();
		}
		
		for (int i=0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
		}
	
	
	
}
