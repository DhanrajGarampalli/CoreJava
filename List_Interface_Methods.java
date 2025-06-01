package collection_Interface;
import java.util.*;
public class List_Interface_Methods {

	public static void main(String[] args) {
		
			List l1=	new	ArrayList();
		
			l1.add(10);	//add method holds only one object.
			l1.add("raj");
			l1.add('M');
			l1.add(null);
			l1.add("Test 123");
			System.out.println(l1);
			
			List l2=new ArrayList();
			
			l2.add("Dhanraj");
			l2.add("soma");
			l2.addAll(l1); //addAll method holds entire Collection.
			System.out.println(l2);
			
			
			System.out.println(l2.get(3));//It give index values of given index number.
		
			boolean b1= l1.equals(l2);//equals compare only with single object values or list of values.
			System.out.println(b1);
			
			//remove: will remove the values based on the index number or based on object value.
			List l3=	new	ArrayList();
			
			l3.add(10);	//add method holds only one object.
			l3.add("raj");
			l3.add("M");
			l3.add(null);
			l3.add("Test 123");
			
			int a =l3.size();
			 System.out.println(a);
			 
			   l3.remove(3);// this remove based on the Indexing.
			   System.out.println(l3);
			   
			   boolean b3=l3.contains("Test 123");//this will check object value contains or not.
			   System.out.println(b3);
			   
			   l3.remove("M");// this remove based on the Object values.
			   System.out.println(l3);
			   
			  l3.removeAll(l3);// this remove based on the Collection name.
			  System.out.println(l3);
			  
			  l3.clear();//this clear the entire Collection.
			  System.out.println(l3); 
			  
			  boolean b2=l3.isEmpty();//this checks list is empty or not.
			  System.out.println(b2);
			  
			 
	}
	
}
