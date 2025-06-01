package array_concepts;

import java.util.Arrays;

public class CopyArray_ReverseOrder {
	public static void main(String[] args) {
		
		int array1 []= new int[4];
		int array2[] = new int[4];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		
		for(int i=0, k=3; i<array1.length; i++)
		{
			
			array2[k]=array1[i];
			k--;
				
		
		}System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
