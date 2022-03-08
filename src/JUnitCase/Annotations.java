package JUnitCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations
{

	@Before
	public void input()
	{
		System.out.println("Before Annotation");
	}
	
	@Test
	public void output() 
	{
	System.out.println("Test Annotation");
	}

	@After
	public void show()
	{
		System.out.println("After Annotation");
	}
	

}
class ABC
{

	  @AfterClass 
	public static void display()
	{
	
	System.out.println("After Class Annotation");
   }

	  @BeforeClass 
		public static void print()
		{
		
		System.out.println("Before Class Annotation");
	}
}

