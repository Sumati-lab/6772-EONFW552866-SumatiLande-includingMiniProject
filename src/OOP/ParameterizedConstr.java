package OOP;

class Parameter
{ 
	int id;                                                 // instance variable 
    String name;                                              // instance variable //creating a parameterized constructor
                                                                     
    Parameter (int id,String name)                                 // Here, I and n are local variables 
{
	this.id = id;
    this.name = name; 
}                                                                   //method to display the values void display() // Member function
void display()
{ 
	System.out.println(id+ " "  +name);
}

}

public class ParameterizedConstr
{
	public static void main(String[] args) 
	{
	    	Parameter obj1 = new Parameter(1,"Madhu");                                 //creating objects and passing values 
	    	Parameter obj2 = new Parameter(2,"Nisha");                                  //creating objects and passing values 
		
			obj1.display();                                                         //calling method to display the values of object
			obj2.display();                                                        //calling method to display the values of object
		
	}
	
}
