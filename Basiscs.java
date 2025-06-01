package array_concepts;

import java.util.Arrays;

public class Basiscs {

	public static void main(String[] args) {
		
	/*	int a[] = new int[5];
		
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
	
		
		System.out.println(a[0]);
		
		for (int i=0; i<4; i++) {//Print array by using for loop.
			System.out.println(a[i]);
		}
		
		
		
		String name[] = new String[5];
		
		name[0] = "Raj1";
		name[1] = "Raj2";
		name[2] = "Raj3";
		name[3] = "Raj4";
		name[4] = "Raj5";
		
		System.out.println(name[3]);
		
		for (int i = 0; i<5; i++)
		{
			System.out.println(name[i]+ a[i]);//both array list we can print in one for loop.
		}*/
		
		
		int a [] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		/*
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		*/
		//else
		for (int i=0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
		
		String S[] = new String[5];
		
		S[0]="Raj";
		S[1]="Raj1";
		S[2]="Raj2";
		S[3]="Raj3";
		S[4]="Raj4";
		/*
		System.out.println(S[0]);
		System.out.println(S[1]);
		System.out.println(S[2]);
		System.out.println(S[3]);
		System.out.println(S[4]);
		*/
		//else
		
		for (int i=0; i<=4; i++)
		{
			System.out.println(S[i]);
		}
		
		
		 int b[]= {20,56,48,79,100,75,100};
		 System.out.println(Arrays.toString(b));
		
	}
	
	
}
