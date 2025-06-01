package collection_Interface;
import java.util.*;
public class ListInterface_ClassProperties {
	public static void main(String[] args) {
		//Array List class Properties.
			ArrayList A1 = new ArrayList();
			
					  A1.add(120);
					  A1.add(120);
					  A1.add("raj");
					  A1.add(null);
					  A1.add(null);
					  
					  
			System.out.println(A1);//Allow Indexing,duplicate,dynamic,heterogeneous,sorting,null.
			
			ArrayList A2 = new ArrayList();
			A2.add(120);
			A2.add(121);
			A2.add(145);
			A2.add(754);
			A2.add(000);
			Collections.sort(A2);
			System.out.println(A2);
			
			Iterator i1 =	A1.iterator();//Iterable. 
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			
			ListIterator li= A2.listIterator();//Listiterable.
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
			
		
			//Vector class Properties.
			Vector V1 = new Vector();
			V1.add(120);
			V1.add(120);
			V1.add("raj");
			V1.add(null);
			V1.add(null);
					  
					  
			System.out.println(V1);
			
			Vector V2 = new Vector();
			V2.add(120);
			V2.add(121);
			V2.add(145);
			V2.add(754);
			V2.add(000);
			Collections.sort(V2);
			System.out.println(V2);
			
			Iterator i2 =	V2.iterator();
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
			ListIterator i3=	V2.listIterator();
			while(i3.hasNext())
			{
				System.out.println(i3.next());
			}
			
			
			//LinkedList class Properties.
			
			LinkedList l1=	new LinkedList();
			l1.add(120);
			l1.add(120);
			l1.add("raj");
			l1.add(null);
			l1.add(null);
					  
					  
			System.out.println(l1);
			
			LinkedList l2=	new LinkedList();
			l2.add(120);
			l2.add(121);
			l2.add(145);
			l2.add(754);
			l2.add(000);
			Collections.sort(l2);
			System.out.println(l2);
			
			Iterator i4 =	l2.iterator();
			while(i4.hasNext())
			{
				System.out.println(i4.next());
			}
			ListIterator i5=	l2.listIterator();
			while(i5.hasNext())
			{
				System.out.println(i5.next());
			}
			
				//Stack class Properties.
			
			Stack s1=	new Stack();
			s1.add(120);
			s1.add(120);
			s1.add("raj");
			s1.add(null);
			s1.add(null);
					  
					  
			System.out.println(s1);
			
			Stack s2=	new Stack();
			s2.add(120);
			s2.add(121);
			s2.add(145);
			s2.add(754);
			s2.add(000);
			Collections.sort(s2);
			System.out.println(s2);
			
			Iterator i6 =	s2.iterator();
			while(i6.hasNext())
			{
				System.out.println(i6.next());
			}
			ListIterator i7=	s2.listIterator();
			while(i7.hasNext())
			{
				System.out.println(i7.next());
			}
			
	}

}
