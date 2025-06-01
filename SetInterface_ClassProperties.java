package collection_Interface;

import java.util.*;


public class SetInterface_ClassProperties {
	public static void main(String[] args) {
		//LinkedHashSet class Properties. 
		LinkedHashSet H1=	new LinkedHashSet();
		H1.add(1);
		H1.add(120);
		H1.add(120);
		H1.add("raj");
		H1.add(null);
		H1.add(null);
		H1.add(10);
		H1.add(220);
		System.out.println(H1);//Not Allow Indexing,Duplicates not allowed. 1 Null allowed.Dynamic. Heterogeneous.
		
		LinkedHashSet H2=	new LinkedHashSet();
		H2.add(1);
		H2.add(120);
		//H2.add(120);
		//H2.add("raj");
		//H2.add(null);
		//H2.add(null);
		H2.add(10);
		H2.add(220);
		
		//Collections.sort(H2);//Sorting not allowed.
		
		Iterator i1=	H2.iterator(); //Iterable but not ListIterable.
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//HashSet class Properties.
				HashSet h3=	new HashSet();
				h3.add(1);
				h3.add(120);
				h3.add(120);
				h3.add("raj");
				h3.add(null);
				h3.add(null);
				h3.add(10);
				h3.add(220);		
				System.out.println(h3);//Not Allow Indexing,Duplicates not allowed. 1 Null allowed.Dynamic. Heterogeneous.
			
				HashSet h4=	new HashSet();
				h4.add(1);
				h4.add(120);
				h4.add(10);
				h4.add(220);
			//Collections.sort(h4);//Sorting not allowed.
				Iterator i2=	h3.iterator(); //Iterable but not ListIterable.
				
				while(i2.hasNext())
				{
					System.out.println(i2.next());
				}	
				
				
				//TreeSet class Properties. 
				TreeSet T1=	new TreeSet();
				T1.add(1);
				T1.add(120);
				T1.add(120);
				//T1.add("raj");
				//T1.add(null);
				//T1.add(null);
				T1.add(10);
				T1.add(220);
				System.out.println(T1);//Not Allow Indexing,Duplicates not allowed. No Null allowed.Dynamic. NO Heterogeneous.
				
				TreeSet T2=	new TreeSet();
				T2.add(20);
				T2.add(1);
	//			T2.add("raj");
	//			T2.add(null);
	//			T2.add(null);
				T2.add(120);
				T2.add(10);
				T2.add(220);
				
				//Collections.sort(T2);//Sorting not allowed.
				
				Iterator i3=	T2.iterator(); //only homogeneous Iterable but not ListIterable.
				
				while(i3.hasNext())
				{
					System.out.println(i3.next());
				}
				
				
				TreeSet T3=	new TreeSet();
				T3.add("raj");
				T3.add("Soam");
				T3.add("Test");
				
				
				Iterator i4=	T3.iterator(); //only homogeneous Iterable but not ListIterable.
				
				while(i4.hasNext())
				{
					System.out.println(i4.next());
				}
				
			
	}

}
