package collection_Interface;

import java.util.*;

public class Sorting {
	
	public static void main(String[] args) {
			
		List l1= new ArrayList(); //Sorting can be done only with Homogeneous(same set of values) values. 
								//We can not sort Heterogeneous(different set of values) values.
			l1.add(600);
			l1.add(500);
			l1.add(400);
			l1.add(100);
			l1.add(140);
			
			System.out.println("Before Sorting:"+l1);
			Collections.sort(l1);//Collections is a class and sort is of its method to sort.
			System.out.println("After Sorting:"+l1);
		
		
			List l2= new ArrayList();
			
			l2.add("raj");
			l2.add(100);
			l2.add(null);
			l2.add("soma");
			l2.add('M');
			
			System.out.println(l2);
			Collections.sort(l2);//Can not possible to sort Heterogeneous values.
			System.out.println(l2);
			
	}

}
