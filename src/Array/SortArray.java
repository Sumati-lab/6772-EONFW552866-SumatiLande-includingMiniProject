// wap to sort an array of numeric 



package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray
{

			public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Number of elements you want to enter: ");
			
			int N= sc.nextInt();
			int[]array=  new int[N];
			
			System.out.println("Enter elements: ");
			for( int i=0; i<array.length; i++)
			{
				array[i]= sc.nextInt();
			}
			
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Array after sorting: "+Arrays.toString(array));
		
	}

}
		

