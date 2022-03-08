package CollectionFrameW;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 
{

	public static void main(String[] args)
	{
		
	LinkedList ls= new LinkedList();
	
	ls.add(1);
	ls.add("Suhani");
	ls.add(3.5);
	ls.add(true);

	Iterator it = ls.iterator();
	while(it.hasNext())		
	
	{
	
	System.out.println(it.next());
	
	
	}

}
}
