// wap to print after removing duplicates from a give string.


package String;

public class Ass3 
{

public static void main(String[] args)
{
 String str= "abbcdddefga";
		 
 System.out.println("Old string is:  " +str);
 System.out.println("New string is:  " +removeDupliChar(str));
 
	}
public static String removeDupliChar(String str)
{
	String newStr="";
	
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
	 if (newStr.indexOf(ch)==-1)
	 {
		 
		newStr+=ch;    //newStr= newStr+ch;
	 }
	 }
	return newStr;
	
	}
}

