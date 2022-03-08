// create an array list which will be able to store only numbers

package CollectionFrameW;

import java.util.*;

class MyArrayList<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;

		} else {
			throw new ClassCastException("Only Integer,Float and Double are supported.");
		}
	}
}

public class Ass4 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();

		try {
			list.add(15);
			list.add(3.4F);
			list.add(3.1445D);
			//list.add("kumar");
		} catch (Exception e)

		{
			e.printStackTrace();

		}
		System.out.println(list);
	}

}
