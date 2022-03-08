package inheritance;

class Sem1
{
	int M1, Mechanix, FPL1;
	public void input1()
	{
		M1= 70;
		Mechanix= 80;
		FPL1= 85;
		
	}
public void output1()
{
	System.out.println("Result Of Sem1 is" );
	System.out.println("Marks in M1: "   +M1);
	System.out.println("Marks in Mechanix: "  +Mechanix);
	System.out.println("Marks in FPL1: "   +FPL1);
	
}

}


class Sem2 extends Sem1
{
	int M2, Graphics, FPL2;
	public void input2()
	{
		M2= 77;
		Graphics= 80;
		FPL2= 90;
		
	}
	public void output2()
	{
		System.out.println("\n \nResult Of Sem2 is: ");
		System.out.println("Marks in M2: "   +M2);
		System.out.println("Marks in Graphics: "  +Graphics);
		System.out.println("Marks in FPL2: "   +FPL2);
		
	}
}


class SingleInheritance {

	public static void main(String[] args) {
	
		{
			Sem2 obj= new Sem2();
			
			obj.input1();
			obj.input2();
			obj.output1();
			obj.output2();
		}
	}
}


	


