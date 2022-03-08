package CollectionFrameW;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 
{

	public static void main(String[] args) 
	{
		
	/*	Map<String,String> map = new TreeMap<String,String>();
		
		map.put("India", "Delhi");
		map.put("USA", "New York");
		map.put("China", "Bijing");	
		map.put("Japan", "Tokio");

	boolean b = map.containsKey("USA");
	
	System.out.println(b);
	
	map.remove("USA");
	
	System.out.println(map);
	
	}

} */

Map<Integer,String> map = new TreeMap<Integer,String>();

map.put(10, "Pranav");
map.put(13, "Prashil");
map.put(12, "Girish");	
map.put(11, "Shiv");

System.out.println("My output is");

for(Map.Entry m:map.entrySet())
{
	System.out.println(m.getKey()+" " +m.getValue());
}
}
}
