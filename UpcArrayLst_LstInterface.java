package collection_Interface;

import java.util.*;

public class UpcArrayLst_LstInterface {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);//example 
		
		List l1=	new ArrayList();//ArrayList is a class and List is Interface(abstract in nature). we are
									//Upcasting AaaryList to List Interface to utilize its abstract methods.
									//Add is one of List Interface method. and which holds...
			l1.add(100);			//follows Indexing.
			l1.add("Raj");			// Holds:Duplicates,Null,Hetrogenious,Dynamic
			l1.add(null);
			l1.add(true);
			l1.add(90.78);
			l1.add('D');
			l1.add("Stroy to tell");
			
			System.out.println(l1);
	}

}
