package Class_18_CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(34);
		li.add(56);
		li.add(16);
		li.add(46);

		Object[] a = li.toArray(); // This is the way our list will be converted to an Object Array
		for (Object x : a) {
			System.out.println(x);
		}
	}
}
