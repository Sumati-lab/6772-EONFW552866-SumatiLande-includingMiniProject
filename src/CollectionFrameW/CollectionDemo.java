package CollectionFrameW;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo
{

	public static void main(String[] args)
	{
	
		
	/*	Set<String> list= new HashSet();
		
		list.add("Two");
		list.add("Shree");
		list.add("Rima");
		list.add("Tushar");
		list.add("Taimur");
		list.add("Sanju"); 
		
	System.out.println(list); */
		
		/*           Set<String> list= new LinkedHashSet();
		
		              list.add("Two");
		              list.add("Shree");
		              list.add("Rima");
		              list.add("Tushar");
		              list.add("Taimur");
		              list.add("Sanju");
		
                       System.out.println(list);         */

	
		
  /*     Set<String> list= new TreeSet();
		
		list.add("Two");
		list.add("Shree");
		list.add("Rima");
		list.add("Tushar");
		list.add("Taimur");
		list.add("Sanju"); 
		
	  System.out.println(list);     */
	
		 List list= new ArrayList();
		 
		    list.add("Rima");
			list.add("Seema");
			list.add("Tina");
			list.add("Deepa"); 
			
		    
	
		  Collections.sort(list);
		  System.out.println(list);	
	
	/* List list= new ArrayList();
	 
	    list.add("Rima");
		list.add("3.3");
		list.add("true");
		list.add("3"); 
		
	  System.out.println(list);	      */
	
	
	//   System.out.println(list.get(2));
	
   
/*       for(int i=0; i<list.size(); i++)
           {
	        System.out.println(list.get(i));
	
        } 
*/
		
	
/*      Iterator itr= list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
*/
		
		
	}
}
