package Java8;

import java.util.function.Predicate;

public class PredicateEvenNo {

	public static void main(String[] args) {
	
		int[] number= {10,15,20,30,40,41,50,59,70,88,90,91};
		
		Predicate<Integer> even= x-> x%2==0;
		for(int i:number)
		{
			if (even.test(i)) 
			{
				System.out.println(i);
				}
			}
	}

}

















