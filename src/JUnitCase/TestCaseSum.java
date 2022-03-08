package JUnitCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import JUnit.Sum;

public class TestCaseSum {

	@Before
	
	public void before()
	{
		System.out.println("Before Test");	
	}
	
	@Test
	public void test1() 
	{
		System.out.println("This is a first test case");
	
		Sum s1= new Sum();
		
		int a = s1.add(4,5);
		
		Assert.assertEquals(9, a);
		}
	
	@Test
	public void test2() 
	{
		System.out.println("This is a second test case");
	
		Sum s2= new Sum();
		
		int b = s2.sub(10,5);
		
		Assert.assertTrue(5 == b);
		}
	@Test
	public void test3() 
	{
		System.out.println("This is a third test case");
	
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9};
			Assert.assertArrayEquals(a, b);
	
		}
	
	
   @After

  public void after()
  {
	System.out.println("After Test");	
  }
}
