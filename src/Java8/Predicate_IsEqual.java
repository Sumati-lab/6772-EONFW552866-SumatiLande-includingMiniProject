package Java8;

import java.util.function.Predicate;

public class Predicate_IsEqual {

	public static void main(String[] args) {
		
		Predicate<String> s= Predicate.isEqual("Happy");
		
		System.out.println(s.test("Hapy"));
		
		//System.out.println(s.test("Sad"));  //false
		//System.out.println(s.test("HAPPY"));  //false
		
	}

}
