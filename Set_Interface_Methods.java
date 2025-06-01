package collection_Interface;
import java.util.*;

public class Set_Interface_Methods {
	public static void main(String[] args) {
		
		//Set behaviors. 
			Set s1=	new HashSet();
			
			s1.add(10);
			s1.add(40);
			s1.add(80);
			s1.add(20);
			s1.add(30);
			System.out.println(s1);//Set will not follow Indexing/Insertion Order.
			//Collections.sort(s1);
			System.out.println(s1);
			
			Set s2=	new HashSet();
			s2.add(100);
			s2.add(100);
			s2.add("raj");
			s2.add("raj");
			System.out.println(s2);//Set will not accept Duplicates and allows Heterogeneous values.
		
			Set s3=	new HashSet();
			s3.add(100);
			s3.add(null);
			s3.add(null);
			s3.add("raj1");
			System.out.println(s3);//Set will not allow multiple Nulls.
			
			//Set Methods.
			
			Set s4 = new HashSet();
			s4.add("raj");
			s4.addAll(s3);//addAll can add entire list.
			s4.add(678);
			System.out.println(s4);
			
			s4.remove(678);
			
			s4.removeAll(s3);
			
			s4.clear();
			
			s4.contains("raj");
			
			int a =s4.size();
			
					
			//s4.get(2); Set will not follow Indexing so there is no get,set,indexOf method in Set.
			Iterator m1= s1.iterator();
			
			while (m1.hasNext())
			{
				System.out.println(m1.next());
			}
			
							
		//Set will not allow hasPrevious and Previous.It allow only in ListIterator.
	}

}
