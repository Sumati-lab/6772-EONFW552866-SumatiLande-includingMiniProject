package MultiThreading;

class A1 extends Thread
{
	public void run()
	{
		System.out.println("Thread A Start");
		for(int i=1; i<=10; i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
					System.out.println("Value of i in thread A" +i);
			}
		
	System.out.println("exit A");
	}
}

class B1 extends Thread
{
	public void run()
	{
		System.out.println("Thread B");
		for(int j=1; j<=10; j++)
		{
			System.out.println("Value of j in thread B" +j);
		}
	System.out.println("exit B");
	}
}

class C1 extends Thread
{
	public void run()
	{
		System.out.println("Thread C");
		for(int k=1; k<=10; k++)
		{
			System.out.println("Value of k in thread C" +k);
		}
	System.out.println("exit C");
	}
}


public class UsingSleep
{

	public static void main(String[] args) 
	{
		
		A1 obj= new A1();
		B1 obj2 = new B1();
		C1 obj3= new C1();
		
		obj.start();
		obj2.start();
		obj3.start();
	}

	}
