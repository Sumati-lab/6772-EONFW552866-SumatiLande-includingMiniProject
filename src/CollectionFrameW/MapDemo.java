package CollectionFrameW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
public static <E> void main(String[] args)
{
	Map <String, String> map= new HashMap<String, String>();
	
map.put("India", "Delhi");
map.put("Maharashtra", "Mumbai");
map.put("USA", "New York");
map.put("China","Bijing");

Set set= map.entrySet();

Iterator<E> itr= set.iterator();
while(itr.hasNext())
{
	Entry me= (Map.Entry)itr.next();
	
	System.out.println(me.getKey()+"   "+me.getValue());
}

}

}

//System.out.println(map);

//System.out.println(map.get("India"));

//System.out.println("Keys: "+map.keySet());

//System.out.println("Value: "+map.values());
