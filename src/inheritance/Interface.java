package inheritance;

interface Test1
{
	final int d= 22;
	abstract public int area();
	abstract public int volume();
}


interface Test2
{
	final int d=25;
	abstract public int area2();
}


class B
{
	public void input()
	{
		System.out.println("This is an input method");
	}

public void output()
{
	System.out.println("This is an output method");
}

}

                                            
 public class Interface extends B implements Test1, Test2
 
 {
	 int i,j;
	 public int area()
	 {
		 i=10;
		 j=20;
		 return i*j;
	 }
	 public int volume()
	 {
		 return (i*j*22);
	 }
	 public int area2()
	 {
		 System.out.println("This is method of Test2 interface");
		 return i*j;
	 }
	 public static void main(String[] args)
	 {
		 Interface i1= new Interface();
		 System.out.println("Area is  "+i1.area2());
		 System.out.println("Area2 is  "+i1.area());
		 System.out.println("Volume is  "+i1.volume());
		 
	 }
 }
 
















	
