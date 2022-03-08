package ExceptionHandling;

class MyException1 extends Exception
{
	public MyException1(String msg)
	{
		super(msg);
	}
	}

class Neha extends Exception
{
	public Neha(String msg)
	{
		super(msg);
	}
}


public class ExceptionHand
	
	{
		int age;
		public void CheckAge(int age) throws MyException
	{
			if (age<0)
			{
				MyException m1= new MyException("Age must be greater than 0");
				throw  m1;
			}
			else
			{
				System.out.println("Age is greater than 0");
			}
			
	
		}
	
	public void CheckName( String nm) throws Neha
	{
		if(nm!="Neha")
		{
			Neha n1= new Neha("Name should be Neha");
			throw n1;
		
}
		else
		{
			System.out.println("Name is right");
		}
	}
	
	public static void main(String[] args) 
		{
			ExceptionHand obj= new ExceptionHand();
			try
			{
				obj.CheckAge (8);
		        obj.CheckName("Nisha");
			}
			
			catch(Exception e)
			{
				System.out.println("Exception Occured");
				e.printStackTrace();
			}
			}
	}

	