package ExceptionHandling;

class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
	}


public class ExceptionHandling2 
	
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
	
	
	
	public static void main(String[] args) 
		{
			ExceptionHandling2 obj= new ExceptionHandling2();
			try
			{
				obj.CheckAge (8);
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
				e.printStackTrace();
			}
			}
	}

	