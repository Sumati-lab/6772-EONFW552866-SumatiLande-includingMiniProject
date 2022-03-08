package MultiThreading;

class A11 extends Thread
{
	public void run()
	{
		System.out.println("Thread AA");
		for(int i=1; i<=10; i++)
		{
			System.out.println("Value of i in thread AA" +i);
		}
	System.out.println("exit AA");
	}
}

class B11 extends Thread
{
	public void run()
	{
		System.out.println("Thread BB");
		for(int i=1; i<=10; i++)
		{
			System.out.println("Value of i in thread BB" +i);
		}
	System.out.println("exit BB");
	}
}

class C11 extends Thread
{
	public void run()
	{
		System.out.println("Thread CC");
		for(int i=1; i<=10; i++)
		{
			System.out.println("Value of i in thread CC" +i);
		}
	System.out.println("exit CC");
	}
}


public class UsingSuspend {

	public static void main(String[] args) {
		
		A11 obj= new A11();
		B11 obj2 = new B11();
		C11 obj3= new C11();
		
            obj.start();
            obj2.start();
		    obj3.start();
		for(int  j=0; j<=5; j++)    
		{
			if(j==4)
			{
				obj.suspend();
				
			}
		System.out.println("Value of j is "  +j);
		}
	}

	}