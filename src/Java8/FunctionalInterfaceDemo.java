package Java8;

interface A {
	public int add(int X, int Y);

	public default void show() {
		System.out.println("This is default method");

	}

	public static void show1() {
		System.out.println("Static method");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		A obj = (X, Y) -> X + Y;
		System.out.println(obj.add(4, 6));

		obj.show();
		A.show1();
	}

}
