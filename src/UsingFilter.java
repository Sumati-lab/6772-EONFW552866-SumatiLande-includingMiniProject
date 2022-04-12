package JavaStreamAPI_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingFilter
{
public static void main(String[] args)
{
	
List<Integer> list = new ArrayList<Integer>();

list.add(30);
list.add(54);
list.add(15);
list.add(76);
list.add(7);

Stream<Integer> obj = list.stream();
//obj.forEach(e->System.out.println(e));;

List<Integer> obj1= list.stream().filter(e->e>54).collect(Collectors.toList());

System.out.println(obj1);

}


}