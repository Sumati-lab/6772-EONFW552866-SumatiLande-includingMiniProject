package ExceptionHandling;

import java.util.Scanner;

class MyException11 extends Exception
{
	MyException11(String msg)
	{
		super(msg);
		
	}
}
public class Source1
{
	public void checkName(String firstName, String lastName) throws MyException11 {
	
		if(firstName.equals(" ") && lastName.equals(" "))
		{
			throw new MyException11("Name should not be blank");
			
		}
		else
		{
			System.out.println(firstName+" "+lastName);
		}
		}
	public static void main(String[] args)
	{
		Source1 obj = new Source1();
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First Name");
			String firstName= sc.next();

			System.out.println("Enter Last Name");
			String lastName= sc.next();
			
			System.out.println();
		obj.checkName(firstName,lastName);
		}
	catch (Exception e)
		{
		System.out.println("Exception occured" +e);
		}
		}
}










