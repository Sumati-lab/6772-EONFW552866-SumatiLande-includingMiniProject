package CollectionFrameW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Apple");
		lhs.add("Orange");
		lhs.add("Banana");		
		lhs.add("Lemon");
		lhs.add("Graphes");


		Iterator it = lhs.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
