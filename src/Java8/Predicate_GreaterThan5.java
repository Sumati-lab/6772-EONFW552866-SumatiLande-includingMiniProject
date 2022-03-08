package Java8;

import java.util.function.Predicate;

public class Predicate_GreaterThan5
{
	public static void main(String[] args) 
	{
		int[] number = { 4, 11,23, 5, 6, 12, 1, 13, 14, 15, 167, 17 };

		{
			Predicate<Integer> grt = x -> x > 5;
			for (int i : number)
			{
				if (grt.test(i));
					
				{
					System.out.println(i);
				}
			}

		}
	}

}
