// // Function example 1: to check the length of the string.

package Java8;

import java.util.function.Function;

public class Function_Ex 
{

	public static void main(String[] args)
	{
	Function <String, Integer> fun= s->s.length();
	
	System.out.println(fun.apply("Kohinoor"));

	}

}
