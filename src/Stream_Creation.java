package JavaStreamAPI_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Stream_Creation {

	public static void main(String[] args) {
		
		// using Stream.of method
		
		Stream<Integer> stream= Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(x-> System.out.println(x));

	
	   // using Stream array method
		
		Stream<Integer> arr= Stream.of(new Integer[] {12,13,14,15,16,17,18});
		arr.forEach(x-> System.out.println(x));
		 
		// using list
		
		
		List<Integer> list= new ArrayList<>();
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
		Stream<Integer> l1= list.stream();
		l1.forEach(a->System.out.println(a));
		
		// using chars()
		
		IntStream s= "BlueRidge_345".chars();
		s.forEach(y-> System.out.println(y));
		}
		
	}
