package MultiThreading;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A");
		for(int i=1; i<=10; i++)
		{
			System.out.println("Value of i in thread A" +i);
		}
	System.out.println("exit A");
	}
}

class B extends Thread
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

class C extends Thread
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


public class MultiThreading1 {

	public static void main(String[] args) {
		
		A obj= new A();
		B obj2 = new B();
		C obj3= new C();
		
		obj.start();
		obj2.start();
		obj3.start();
	}

	}

