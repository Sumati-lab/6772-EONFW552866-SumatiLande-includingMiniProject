package JavaStreamAPI_Java8;

import java.util.Arrays;
import java.util.List;

public class Match
{

	public static void main(String[] args)
	{
	List<Integer>num= Arrays.asList(22,13,40,85,20);
	
	boolean b= num.stream().anyMatch(n->n%22==0);
	
	//boolean b= num.stream().allMatch(n->n%22==1);
	System.out.println(b);
	
	
	}

}
