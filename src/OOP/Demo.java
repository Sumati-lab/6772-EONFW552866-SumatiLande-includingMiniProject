package OOP;

public class Demo {
		

	public void Square(int b)
	
	{
		System.out.println("Area of Square is: "+(b*b));
	}
	
    public void Triangle(int b, int h)
	
	{
		System.out.println("Area of Triangle is: "+(0.5*b*h));
	}
    
    public static void show()
    {
    	System.out.println("Hello Students");
    }
    
    public int add(int c, int d)
	{
		return c+d;
	}

    
	
	public static void main (String[] args)
	{
		Demo obj33= new Demo();
		Demo.show();
		obj33.Square(10);
		obj33.Triangle(10,20);
		{
		System.out.println("Addition is:  "+obj33.add(22,33));
	}
	}
	}

