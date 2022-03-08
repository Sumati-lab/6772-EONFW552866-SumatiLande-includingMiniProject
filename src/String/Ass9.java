// wap to calculate sum of the numbers appear in a given string 

package String;

public class Ass9 {

		public int sumOfTheNumbers(String stng) 
		{
			int l = stng.length();
			int sum = 0;
			String temp = "";
			for (int i= 0; i<l; i++)
			{
				if (Character.isDigit(stng.charAt(i))) 
				{
					if (i < l - 1 && Character.isDigit(stng.charAt(i + 1)))
					{
						temp += stng.charAt(i);
					} else
					{
						temp += stng.charAt(i);
						sum += Integer.parseInt(temp);
						temp = "";
					}
				}
			}
			return sum;
		}

		public static void main(String[] args) 
		{
			Ass9 obj = new Ass9();
			String str1 = "Kolkata 67 Madhu # 45";
			System.out.println("The given string is: " + str1);
			System.out.println("The sum of numbers in the string is: " + obj.sumOfTheNumbers(str1));

		}

	}
