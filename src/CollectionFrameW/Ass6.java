// Implement the assignment 1 using Linked List

package CollectionFrameW;

import java.util.LinkedList;

public class Ass6
{

	private LinkedList<Integer> list = new LinkedList<Integer>();

	public LinkedList<Integer> saveEvenNumbers(int N)
{
		list = new LinkedList<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0)
				list.add(i);
		}

		return list;
	}

	public LinkedList<Integer> printEvenNumbers()
	{
		LinkedList<Integer> newList = new LinkedList<Integer>();

		for (int item : list) 
		{
			newList.add(item * 2);
			System.out.println(item * 2);
		}

		return newList;
	}

	public static void main(String[] args)
	{
		Ass6 obj = new Ass6();
		obj.saveEvenNumbers(10);
		obj.printEvenNumbers();

	}

}
