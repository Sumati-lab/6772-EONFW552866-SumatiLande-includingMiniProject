//wap to print elements of one array into another array

package Array;

import java.util.Arrays;

public class Ass7
{

	public static void main(String[] args)
	{
		int array[]= {10,20,30,40,50};
		int array2[]= new int[array.length];
				
		System.arraycopy(array, 0, array2, 0, array.length);
		System.out.println("Print elements of second array is: "  +Arrays.toString(array));
		
	}			

}
