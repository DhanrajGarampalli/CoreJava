package collection_Interface;
import java.util.*;
import java.util.Map.Entry;
public class MapInterface_Behaviour {
	public static void main(String[] args) {
		
			Map<String, Integer> m1=	new HashMap<String, Integer>();
			m1.put("Dhanraj", 14);
			m1.put("Dhanraj1", 15);
			m1.put("Dhanraj2", 16);
			m1.put("Dhanraj3", 17);
			m1.put("Dhanraj4", 18);
			m1.put("Dhanraj5", 19);
			
			System.out.println(m1);
		
			Map<String, Integer> m2=	new HashMap<String, Integer>();
			m2.put("Dhanraj", 14);
			m2.put("Dhanraj11", 15);
			m2.put("Dhanraj12", 16);
			m2.put("Dhanraj13", 17);
			m2.put("Dhanraj14", 18);
			m2.put("Dhanraj15", 19);
			m2.put("Dhanraj15", 19);
			System.out.println(m2);
			
			boolean b1 =m1.equals(m2); //equal or no
			System.out.println(b1);
			
			    m2.putAll(m1);//put m1 into m2. Key should be unique.
			    System.out.println(m2);
			
			   m1.clear();//clear the collection
			   System.out.println(m1);
			   
			   boolean b2 =m1.isEmpty();// check if collection is empty or not.
			   System.out.println(b2);
			   
			   m2.putIfAbsent("Dhanraj25", 1999);//If key value is absent it will add new value.  
			   System.out.println(m2);
			   
			   boolean b3 =m2.containsKey("Dhanraj25");//Checks key value contains.
			   System.out.println(b3);
			   
			   boolean b4 =m2.containsValue(1999);//Checks Value contains.
			   System.out.println(b4);
			   
			   for(String s1: m2.keySet())//Gets all the key values.
			   {
				   System.out.println(s1);
			   }
			   
			   for(Integer s2: m2.values())//Gets all the values.
			   {
				   System.out.println(s2);
			   }
			   
			   for(Entry <String,Integer>s3: m2.entrySet())//Getting both Key and values.
			   {
				   System.out.println(s3);
			   }
			   
			   
			   Set<Entry <String, Integer>> s4= m2.entrySet();
			   
			   		Iterator i2=	s4.iterator();
			   while (i2.hasNext())
			   {
				   System.out.println(i2.next());
			   }
			   
			   
			   
			   
			    
			
	}

}
