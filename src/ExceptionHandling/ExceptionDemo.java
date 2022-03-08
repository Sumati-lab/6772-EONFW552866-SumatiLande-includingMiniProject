package ExceptionHandling;

public class ExceptionDemo {
int a= 10;
public void Demo()
{
	try                         //THROW THE EXCEPTION USING TRY
	{
			System.out.println("Hello");
			int c= a/0;
			System.out.println("C"); 
	}
	catch (Exception e)              //CATCH THE EXCEPTION USING CATCH
	{
			System.out.println("Exception is occured"  +e);
	}
System.out.println("Hello Again");
}
	void Show()
	{
		System.out.println("Show Method");
	
	}
	
	
	
	public static void main(String[] args) {
		
	ExceptionDemo e1= new ExceptionDemo();
	
	e1.Demo();
	e1.Show();
	}
	
}

