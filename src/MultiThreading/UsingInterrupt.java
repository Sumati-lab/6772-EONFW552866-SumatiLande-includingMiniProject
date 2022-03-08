package MultiThreading;

class One extends Thread
{
	public void Run()
	{
	System.out.println("Thread 1 starts");
	
	try
		{
for(int i=1; i<5; i++)
{
Thread.sleep(5000);
System.out.println("Hello");
}

	}
catch (InterruptedException e)
	{
	
	System.out.println("Thread occured "      +e);
	
	e.printStackTrace();
	
	}
}
	
}

class Two extends Thread
{
	public void run()
	{
		System.out.println("Thread 2");
		for(int j=1; j<=10; j++)
		{
			System.out.println("Value of j in thread 2 is: " +j);
		}
	System.out.println("exit thread 2");
	}
}
public class UsingInterrupt {

	public static void main(String[] args) {
		
		One o1= new One();
		Two o2= new Two();
		o1.start();
		o2.start();
		
		o1.interrupt();
		System.out.println(o1.isInterrupted());
		System.out.println(o2.isInterrupted());
	}

}
