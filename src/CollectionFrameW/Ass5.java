/* Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee object based on id number.                    */


package CollectionFrameW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private double salary;

	public Employee(int id, String name, String address, Double salary) {
		super();

		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;

	}

	public int getId() {
		return id;

	}

	@Override

	public String toString() {
		return "Employee[id=" + id + ",name=" + name + " ,address=" + address + " , salary" + salary + "]";

	}

}

public class Ass5 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(100, "Yash", "123 street, India", 10000.0));
		list.add(new Employee(101, "Raj", "124 street, India", 20000.0));
		list.add(new Employee(102, "Shiv ", "125 street, India", 30000.0));

		Iterator<Employee> it = list.iterator();
		int searchId = 100;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)

				System.out.println(emp);
		}

	}

}
