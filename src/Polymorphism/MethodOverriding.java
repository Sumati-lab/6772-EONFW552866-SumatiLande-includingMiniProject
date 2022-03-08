package Polymorphism;                            //method overriding simple prgm

class Student
{
	
public void Study()
{
	System.out.println("Student should have to do study");
}
}
class SciStu extends Student
{

public void Study()

{
	super.Study();                                     //super keyword is used to print the parent class o/p statement
	System.out.println("Science students needs to study chem and bio");
}
}



public class MethodOverriding {

	public static void main(String[] args) {
		SciStu obj= new SciStu();
		obj.Study();
	}
		
	}


