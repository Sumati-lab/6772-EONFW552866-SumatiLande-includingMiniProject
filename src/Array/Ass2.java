// wap to sort an array of numeric or string data.package Array;

package Array;

import java.util.Arrays;

public class Ass2 
{

    public static void main(String[] args)
		{
			int[] array1 = { 1000, 300, 560, 780, 900, 100, 136, 340, 260};

			String[] array2 = { "Adrian", "Sachin", "Shubham", "Pooja", "Prashant", "Tathagath" };
			
			
			System.out.println("Old Numeric Array : " + Arrays.toString(array1));
			Arrays.sort(array1);
			System.out.println("Sorted Numeric Array : " + Arrays.toString(array1));

			
			System.out.println("Old String Array : " + Arrays.toString(array2));
			Arrays.sort(array2);
			System.out.println("Sorted String Array : " + Arrays.toString(array2));
		}

	}
