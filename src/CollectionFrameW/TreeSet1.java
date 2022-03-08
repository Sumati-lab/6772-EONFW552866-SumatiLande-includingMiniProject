package CollectionFrameW;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 
{

	public static void main(String[] args)
	{

		TreeSet<String>ts= new TreeSet();
		
		ts.add("Red");
		ts.add("Blue");
		ts.add("Orange");
		ts.add("Yellow");
	
		Iterator it= ts.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next().toString());
			
		}
		
		
	}

}
