//wap to check if see if array contains a specific value.

package Array;

public class Ass3 
{

	public static void main(String[] args) 
	{
		int[]a= {10,20,30,40,50};
		int n= 30;
		
		for(int i=0; i<a.length;i++)
		{
			if(n==a[i])
			{
				System.out.println("Array contains specific value");
			}
		}

	}

}
