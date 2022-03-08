//wap to remove particular elements of an array

package Array;

import java.util.Arrays;

public class Ass5 {

		public static int[] removeTheElement(int[] arr, int index)

		{
			if (arr == null || index < 0

					|| index >= arr.length)
			{

				return arr;

			}

			int[] anotherArray = new int[arr.length - 1];

			for (int i = 0, k = 0; i < arr.length; i++) 
			{

				if (i == index) {

					continue;

				}
				anotherArray[k++] = arr[i];

			}
			return anotherArray;

		}

		public static void main(String[] args)
		{
			int[] arr = { 11,22,33,44,55 };

			System.out.println("Old Array: " + Arrays.toString(arr));
			int index = 2;

			System.out.println("Index to be removed: " + index);
			arr = removeTheElement(arr, index);

			System.out.println("Resultant Array: " + Arrays.toString(arr));

					
		}

	}
