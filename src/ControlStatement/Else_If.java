package ControlStatement;

import java.util.Scanner;

public class Else_If
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	int day;
		
		Scanner in = new Scanner ("System.in");	
	    System.out.println("Enter day betwn 0 to 6 day=");
	
	    int Day = in.nextInt();
	
	if(Day==0)
	{
		System.out.println("Sunday");
	}
	
	else if (Day==1)
	{
		System.out.println("Monday");
	}

	else if (Day==2)
	{
		System.out.println("Tuesday");
	}
	
	else if (Day==3)
	{
		System.out.println("Wednesday");
	}

	else if (Day==4)
	{
		System.out.println("Thursday");
	}
	
	else if (Day==5)
	{
		System.out.println("Friday");
	}
	
	else if (Day==6)
	{
		System.out.println("Saturday");
	}
	

	}
	}