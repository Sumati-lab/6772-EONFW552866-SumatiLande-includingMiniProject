package JUnitCase;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import JUnit.Mul;

public class TestCaseMul {

	@Test
	public void test() 
	{
		
		System.out.println("This is a first test case");
	
	Mul m1= new Mul();
	
	int a = m1.cal(4,5);
	
	Assert.assertEquals(20, a);
	}

}
