package CollectionFrameW;

import java.util.HashSet;
import java.util.Iterator;



public class HashSet1 
{

	public static void main(String[] args )
			{
	
HashSet hash= new HashSet();

hash.add("Apple");
hash.add("Orange");
hash.add("Banana");		
hash.add("Lemon");
hash.add("Graphes");


Iterator it = hash.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
}


	}


