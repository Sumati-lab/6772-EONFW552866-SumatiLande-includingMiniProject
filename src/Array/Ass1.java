// wap to find average of an array

package Array;

public class Ass1 

	{

	public static void main(String[] args)
		{
			int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
			int length = arr.length;
			int sum = 0;
			for (int i = 0; i<arr.length; i++) 
			{
				sum += arr[i];
			}
			double average = sum / length;
			System.out.println("Average of array : " + average);

		}

	}

