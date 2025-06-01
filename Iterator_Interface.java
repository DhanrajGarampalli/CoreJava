package collection_Interface;
import java.util.*;
public class Iterator_Interface {
	public static void main(String[] args) {
		
	List l1=	new ArrayList();		
		l1.add(199);
		l1.add(23);
		l1.add(354);
		l1.add(null);
		l1.add(657);
		l1.add(000);
		l1.add("raj");
		l1.add('M');
		
		System.out.println(l1);
		
			Iterator m1 =	l1.iterator();//iterator is abstract method. Iterator is a Interface.
			
			while(m1.hasNext())   //iterator,hasNext,next are the abstract method of Iterator Interface.
			{
				System.out.println(m1.next());
			}
		
	//we can only iterate in forward direction. 
	}
	

}
