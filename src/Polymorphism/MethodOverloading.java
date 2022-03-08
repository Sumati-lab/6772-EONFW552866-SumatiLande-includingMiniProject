package Polymorphism;

class Poly {
	void input(int r, String nm) {
		System.out.println("Roll No:  " + r + "\n Name:  " + nm);
	}

	void input(String ph, String addre) {
		System.out.println("Contact No: " + ph + "\n Address: " + addre);

	}

	void input(int m1, int m2, int m3)

	{
		System.out.println("Marks in sub1: " + m1 + "\n Marks in sub 2: " + m2 + "\n Marks in sub3:  " + m3);

	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		{
			Poly p1 = new Poly();
			p1.input(100, "Sumati");

			p1.input("1234567890", "Shirdi");

			p1.input(80, 70, 90);
		}
	}

}
