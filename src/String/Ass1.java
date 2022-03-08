//write a java prgm to compare two strings lexiographically.

package String;

public class Ass1 
{
	
public static void main(String[] args)
{
	String s1 = "Hello";
	String s2 = "Hello";
	String s3 = "Hi";
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));    //H is same in both strings.2nd char is e and i.  i-e= -4

	System.out.println(s3.compareTo(s1));   //H is same in both strings.2nd char is i and e e-i= 4 in other words, i>e, s3>s1
}
}



  //The String compareTo() method compares values lexicographically and returns an 
//integer value that describes if first string is less than, equal to or greater than second 
//string.