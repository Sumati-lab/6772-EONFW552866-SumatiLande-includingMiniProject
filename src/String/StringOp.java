package String;

public class StringOp {

	public static void main(String[] args) {
		String x1= "School";
		System.out.println(x1.charAt(3));
		
		String x2= "Bhushan";
		System.out.println(x2.concat("Raj"));
		
		String x3= "Bhushan";
		System.out.println(x3.length());
		
		String x4= "AbAbAb";
		System.out.println(x4.replace('b','B'));
		
		String x5= "Saishwari";
		System.out.println(x5.endsWith("ishwari"));
		
		String x6= "Football";
		System.out.println(x6.startsWith("Foot"));
		
		String x7= "Pune City";
		System.out.println(x7.substring(5));
		System.out.println(x7.substring(5,8));
		
		String x8= "Pune City";
		System.out.println("x8.indexOf(n) =" +x8.indexOf('n'));
		
		
	}

}
