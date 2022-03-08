

		package Polymorphism;                            //method overriding using parameterized constru

		class Student3
		{
			public Student3(int c)
			{
				System.out.println("This is a Student3 class constructor");
			}
		public void Study3()
		{
			System.out.println("Student should have to do study");
		}
		}
		class SciStu3 extends Student3
		{
			public SciStu3(int x, int y)
			{
			super(x);
			
				System.out.println(x+  "This is a ScienceStud2 class constructor"  +y);
			}
		public void Study3()

		{
			super.Study3();                                     //super keyword is used to print the parent class o/p statement
			System.out.println("Science students needs to study chem and bio");
		}
		}



		public class MethodOverriding3{

			public static void main(String[] args) {
				SciStu3 obj= new SciStu3(20,30);
				obj.Study3();
			}
				
		

}
