package collection_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
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
		
		Iterator m= l1.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
		
		ListIterator m2=l1.listIterator();
		while(m2.hasNext())//First Iterate in forward direction. 
		{
			System.out.println(m2.next());
		}
		
		while(m2.hasPrevious()) {// Use same variable and to Iterate in backward direction.
			System.out.println(m2.previous());
		}
		
	}

}
