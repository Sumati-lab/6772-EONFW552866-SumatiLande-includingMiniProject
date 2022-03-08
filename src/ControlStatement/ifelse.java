package ControlStatement;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int marks;
              Scanner in = new Scanner( System.in);
              System.out.println(" Enter Your Mark:");
       marks= in.nextInt();
	
	    if(marks >= 35)
	{		
	   System.out.println("You Are Pass");
	}
	else
	{
		System.out.println("You Are Fail");	
	}
	

	}

}
	
	
	
