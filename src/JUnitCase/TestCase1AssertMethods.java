package JUnitCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1AssertMethods {

	@Test
	public void test() 
	{
		String s1= null;
		String s2= "Welcome";
		
	assertNotNull(s2);
	
	}
	
  @Test
  public void test1() 
	{
		String s1= null;
		String s2= "Java";
		
	assertNull(s1);
	
	}
	
  @Test
  public void test2() 
	{
		String s1= "Edubridge";
		String s2= "Edubridge";
		
	assertSame(s1,s2);
	
	}

  @Test
  public void test22() 
	{
		String s1= "Edubridge";
		String s2= "Java";
		
	assertNotSame(s1,s2);
	
	}
  
  
  @Test
  public void test3() 
	{
int arr1[]= {1,2,3,4};
int arr2[]= {5,6,7,8};

assertArrayEquals(arr1, arr2);
	}
  
  @Test
  public void test4() 
	{
  int a =5;
  int b=5;
  int c= a+b;
  
  assertTrue(c==10);
  assertFalse(c==11);
	}
  
}