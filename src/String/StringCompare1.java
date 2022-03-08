package String;

public class StringCompare1
{

	public static void main(String[] args)
	{
		
		String s1="Sachin";
		
		String s2="Sachin";
		
		String s3=new String("Sachin");
		
		String s4="Saurav";
		
System.out.println(s1.equals(s2));                /*The String equals() method compares the original content of the string.It
                                                   compares values of string for equality.*/
			
System.out.println(s1.equals(s3));


System.out.println(s1.equals(s4));
	
	}
		
	}


