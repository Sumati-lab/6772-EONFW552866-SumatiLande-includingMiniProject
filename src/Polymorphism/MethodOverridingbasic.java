package Polymorphism;

class Animal
{
	public void move()
	{
	System.out.println("Aimal can move");
    }
}
class Dog extends Animal
{
	public void move()
	{
		super.move();                            //super keyword is used to display parent class/super class method
		System.out.println("Dog can walk and run");
	}
}


public class MethodOverridingbasic
{
public static void main(String[] args)
{
		
Dog d = new Dog();
d.move();                          //sub class method.
	}

}
