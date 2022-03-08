package inheritance;

	
class Sem11
{
	int DBMS, MP,BEE;

	public void input11()
	{DBMS= 70;
		MP=80;
		BEE= 86;
	}
    public void output11()
    {
    System.out.println("Result of Semester1 is \n");
    System.out.println("Marks in DBMS:  +DBMS");
	System.out.println("Marks in BEE:   +BEE");
	System.out.println("Marks in MP +MP");
	System.out.println("******************************");
    
}



class Sem22 extends Sem11
{
	int DM, TOC, OOP;

	public void input22()
	{
		DM=89;
		TOC= 90;
		OOP=78;
	}
    public void output22()
    {
    System.out.println("Result of Semester2 is \n");
    System.out.println("Marks in DM:  +DM");
	System.out.println("Marks in TOC:  +TOC");
	System.out.println("Marks in OOP:  +OOP");
	System.out.println("******************************");
	}
    
}

class Sem33 extends Sem22
{
	int C, DS, Java;

	public void input33()
	{
		C= 77;
		DS=90;
		Java=80;
	}
    public void output33()
    {
    System.out.println("Result of Semester3 is \n");
    System.out.println("Marks in C:   +C");
	System.out.println("Marks in DS:   +DS");
	System.out.println("Marks in Java:  +Java");
	System.out.println("******************************");
	}
    
}

class  MultilevelInheritance
{
 
public static void main(String[] args)
{
		
	Sem33 obj= new Sem33();
			
 obj.input11();
 obj.output11();
 obj.input22();
 obj.output22();
 obj.input33();
 obj.output33();
 
	}

}

}
