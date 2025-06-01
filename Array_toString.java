package array_concepts;
import java.util.*;
public class Array_toString {
	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<=4; i++)
		{
			a[i]= s.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
		}
	}

}
