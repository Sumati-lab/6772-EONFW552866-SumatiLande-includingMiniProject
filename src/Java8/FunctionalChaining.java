package Java8;

import java.util.function.Function;

public class FunctionalChaining {

	public static void main(String[] args) {
		
	int amount= 3;
	
	Function<Integer, Integer> sum= i-> i+i;        //3+3=6
	Function<Integer, Integer> mul= i-> i*i;        //3*3=9
	
	System.out.println(sum.apply(amount));
	
	System.out.println(mul.apply(amount));
	
	System.out.println(sum.andThen(mul).apply(amount)); //sum is 6, 6*6=36
	
	System.out.println(sum.compose(mul).apply(amount));  //mul is 9, 9+9= 18
	
	}

}
