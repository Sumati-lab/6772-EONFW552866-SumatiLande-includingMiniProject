package Operators;

public class Precedence {

	public static void main(String[] args) {

		int a = 4, b = 2, c = 10, d = 6, cal;

		cal = d++ * 2 + (++c) / a;

		System.out.println("Calculation is  " + cal);

	}

}
