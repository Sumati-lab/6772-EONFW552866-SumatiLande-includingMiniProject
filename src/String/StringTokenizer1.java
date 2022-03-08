package String;

import java.util.StringTokenizer;

		public class StringTokenizer1
		{
		
		public static void main(String args[])
		{
			
		System.out.println("Using Constructor 1 - ");
		
		StringTokenizer st1 = new StringTokenizer("Life Of Pune", " ");
		
		while (st1.hasMoreTokens())
		{
		System.out.println(st1.nextToken());
		}
		
		
		System.out.println("Using Constructor 2 - ");
		
		StringTokenizer st2 = new StringTokenizer(" JAVA : C : C++", ":");
				
		while (st2.hasMoreTokens())
		{
		System.out.println(st2.nextToken());
		} 
		
		System.out.println("Using Constructor 3 - ");
		
		StringTokenizer st3 = new StringTokenizer(" JAVA : C : C++", ":", false);
		
		while (st3.hasMoreTokens())
		{
		System.out.println(st3.nextToken());
		}
		
System.out.println("Using Constructor 4 - ");
		
		StringTokenizer st4 = new StringTokenizer("JAVA :C :C++", ":", true);
		
		while (st4.hasMoreTokens())
		{
		System.out.println(st4.nextToken());
		}
		
		}
		}

		
		/*If the flag is false, delimiter characters serve to separate tokens.
		If the flag is true, delimiter characters are considered to be tokens.*/
		
		
		