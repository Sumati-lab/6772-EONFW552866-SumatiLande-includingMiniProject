// Consumer Chaining Example

package Java8;

import java.util.function.Consumer;

public class ConsumerChaining 
{

	public static void main(String[] args) 
	{
		Consumer<String> c= x->System.out.println(x.toUpperCase());
		
		Consumer<String> c1= x->System.out.println(x);
		
		c.andThen(c1).accept("Action is the foundation key of success");
		
		
	}
}


