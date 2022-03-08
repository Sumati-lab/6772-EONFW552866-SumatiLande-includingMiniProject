package Java8;

import java.util.function.Predicate;

public class Predicate_OddNo {

	public static void main(String[] args) {
		int[] num = { 1, 2, 33, 26, 25, 27, 30, 40, 45 };

		Predicate<Integer> p = y -> y % 2 == 1;
		for (int i : num) {
			if (p.test(i)) {
				System.out.println(i);
			}

		}
	}

}
