package ControlStatement;

import java.util.Scanner;

public class SimpleIf
{

public static void main(String[] args) 
{
	//If we have only one condition, then we will use simple if statement.
	// statement will be evaluated if the value of condition is true.	

	int marks;

	Scanner in= new Scanner(System.in);
  
	System.out.println("Enter your marks: ");
   
    marks= in.nextInt();
    
	if (marks>= 65)
	{
		System.out.println("You are pass with first class");	
	}

}



}
