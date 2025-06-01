package collection_Interface;
import java.util.*;
public class CursorsInJava {
	public static void main(String[] args) {
		
		//Cursors: 1.Iterator. 2.ListIterator. 3.Enumeration.
		//1.Iterator:
			List H1=		new ArrayList();
		H1.add(1);
		H1.add(120);
		H1.add(120);
		H1.add("raj");
		H1.add(null);
		H1.add(null);
		H1.add(10);
		H1.add(220);
		
		Iterator i1 = H1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//2.ListIterator:
		List H2=		new ArrayList();
		H2.add(1);
		H2.add(120);
		H2.add(120);
		H2.add("raj");
		H2.add(null);
		H2.add(null);
		H2.add(10);
		H2.add(220);
	
	ListIterator i2 = H2.listIterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	//3.Enumeration:Iterating the Legacy classes is know as Enumeration.(Vector,Stack,Hashtable,Properties,Dictionary.
			Vector<Object> V1=		new Vector<Object>();
			V1.add(1);
			V1.add(120);
			V1.add(120);
			V1.add("raj");
			V1.add(null);
			V1.add(null);
			V1.add(10);
			V1.add(220);
		
				Enumeration E1=	V1.elements();
				while(E1.hasMoreElements())
				{
					System.out.println(E1.nextElement());
				}
	
	
	}

}
