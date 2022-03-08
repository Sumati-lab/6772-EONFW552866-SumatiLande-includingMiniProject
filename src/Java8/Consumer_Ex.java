package Java8;

import java.util.function.Consumer;

public class Consumer_Ex
{
	public static void main(String[] args) 
	{
		Consumer<String> c = s -> System.out.println(s);

		c.accept("Hello");
	}
}