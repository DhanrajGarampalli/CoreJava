package array_concepts;

import java.util.Arrays;

public class CopyAry_toNewAry {
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		int b[]= {10,20,30,40,80,100};
		
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		
		int c[]= new int[5];
		for(int i=4; i>=0; i--) {
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
