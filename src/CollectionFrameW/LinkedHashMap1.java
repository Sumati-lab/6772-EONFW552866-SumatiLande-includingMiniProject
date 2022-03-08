package CollectionFrameW;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1
{

	public static void main(String[] args)
	{
		Map<String,String> map = new LinkedHashMap<String,String>();
		
		map.put("India", "Delhi");
		map.put("Maharashtra", "Mumbai");
		map.put("USA", "New York");
		map.put("China","Bijing");
//
	 	//boolean b = map.containsKey("USA");
			//	System.out.println(b);
	
	Set s= map.entrySet();
	
	Iterator itr= s.iterator();
	while (itr.hasNext())
{
	Map.Entry me= (Map.Entry)itr.next();
	
	System.out.println(me.getKey()+ " "+me.getValue());
}
	}
}