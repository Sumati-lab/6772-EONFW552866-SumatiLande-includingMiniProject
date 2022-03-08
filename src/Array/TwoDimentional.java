package Array;

public class TwoDimentional 
{

	public static void main(String[] args)
	{
	
		int[][]ar= new int[3][3];
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		ar[2][0]=70;	
		ar[2][1]=80;
		ar[2][2]=90;
		
	for(int i=0; i<ar.length;i++)              //this outer for loop is for rows
	{
		for (int j=0; j<ar[i].length; j++)      //inner for loop is for columns
		{
			System.out.println(ar[i][j]+" ");
			
		}
	System.out.println("\n");
	
	}
	}
}
