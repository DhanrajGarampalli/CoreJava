package array_concepts;

public class FindIndX_numOfArray {
	public static void main(String[] args) {
		
		int a[]= new int [5];
		int numtocheck=10;
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
		
		for (int i=0; i<=4; i++)
		{
			//System.out.println(a[i]);
			
			if(numtocheck == a[i])
			{
				System.out.println("Number is present in array: that is:-"+a[i]);
				System.out.println("And the Index of number is "+i);
			}
		}
	}

}
