package Array;

public class ArrayArgument
{
	public void display(int arr [])
	{
		for (int i=0; i<arr.length; i++);
		{
			System.out.println("arr[i]");
		}
	}

	public static void main(String[] args)
	{
		
int marks[]= {20,25,30,32,20};

ArrayArgument obj = new ArrayArgument();

obj.display(marks);

	
	}

}
