
		package Polymorphism;                            //method overriding using defalut constructor.

		class Student2
		{
			public Student2()
			{
				System.out.println("This is a Student2 class constructor");
			}
		public void Study2()
		{
			System.out.println("Student should have to do study");
		}
		}
		class SciStu2 extends Student2
		{
			public SciStu2()
			{
				System.out.println("This is a ScienceStud2 class constructor");
			}
		public void Study2()

		{
			super.Study2();                                     //super keyword is used to print the parent class o/p statement
			System.out.println("Science students needs to study chem and bio");
		}
		}



		public class MethodOverriding2 {

			public static void main(String[] args) {
				SciStu2 obj= new SciStu2();
				obj.Study2();
			}
				
			}
	

