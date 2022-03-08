package CollectionFrameW;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{

	public static void main(String[] args)
	{
		
		ArrayList al= new ArrayList();
	
	al.add(23);
	al.add(3.5);
	al.add("Shital");
	al.add(true);

	Iterator it= al.iterator();
	while(it.hasNext())		
	
	{
	
	System.out.println(it.next());
	
	
	}
}
}