//wap to print frequency of each character in a string.(Welcome in edubridge family) like w=1,e=4,l=2.

package String;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ass5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s = sc.next();
		
		char arr[] = s.toCharArray();
		int count = 0;

		Map<Character, Integer> map = new TreeMap<>();

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				count++;

				map.put(arr[i], count);
			}
		}
		System.out.println(map);

	}
}
