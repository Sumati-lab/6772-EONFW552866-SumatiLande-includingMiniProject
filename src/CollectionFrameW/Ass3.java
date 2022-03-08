//Create an ArrayList which will be able to store only Strings.
//Create a printAll method which will print all the elementsusing an Iterator.

package CollectionFrameW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ass3
{

	public static void main(String[] args)
	{

		List<String> list = new ArrayList<>();

		list.add("Manali");
		list.add("Kumar");
		list.add("Shital");
		list.add("Divya");

		printAll(list);
	}

	public static void printAll(List<String> list) 
	{

		Iterator it = list.iterator();
		while (it.hasNext())

		{

			System.out.println(it.next());

		}
	}
}
