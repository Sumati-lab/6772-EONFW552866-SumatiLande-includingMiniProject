package inheritance;

abstract class ABC
{
int a;
ABC()
{
	System.out.println("This is a constructor");
	
}
public int cal (int a, int b)
{
	return a*b;
}

abstract void show();
}

public class AbstractClass extends ABC
{

	public static void main(String[] args) 
		
	{
		AbstractClass a1 = new AbstractClass();
		int c= a1.cal(5, 6);
		
	System.out.println("Multiplication is "  +c);
	
	a1.show();
	}
void show()

{
System.out.println("This is abstract methiod");
}
	}
