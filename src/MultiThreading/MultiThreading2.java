package MultiThreading;

class AA implements Runnable
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

class BB implements Runnable
{
	public void run()
	{
		System.out.println("Thread BB");
		for(int j=1; j<=10; j++)
		{
			System.out.println("Value of j in thread BB" +j);
		}
	System.out.println("exit BB");
	}
}

class CC implements Runnable
{
	public void run()
	{
		System.out.println("Thread CC");
		for(int k=1; k<=10; k++)
		{
			System.out.println("Value of k in thread CC" +k);
		}
	System.out.println("exit CC");
	}
}


public class MultiThreading2 {

	public static void main(String[] args) {
		
		AA obj= new AA();
		BB obj2 = new BB();
		CC obj3= new CC();
		
		Thread t= new Thread(obj);
		Thread t1= new Thread(obj2);
		Thread t2= new Thread(obj3);
		
		t.start();
		t1.start();
		t2.start();
	}

	}
