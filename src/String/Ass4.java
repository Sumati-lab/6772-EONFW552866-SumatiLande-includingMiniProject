//wap to find the maximum occuring character in a string..

package String;

public class Ass4 {

	public static void main(String[] args) {

		String s = "Pune University";

		// s= s.replaceAll("\\s", "") or s=s.replace(" ", "");
		// System.out.println(s);

		int[] arr = new int[127]; // 127 or 256
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;

		}
		int max = -1;
		char c = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (max < arr[s.charAt(i)])

			{
				max = arr[s.charAt(i)];
				c = s.charAt(i);
			}
		}
		System.out.println("Maximum repeated character is:  " + c);
	}
}
