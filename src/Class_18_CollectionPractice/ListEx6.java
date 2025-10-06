package Class_18_CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add("mango");
		li.add("orange");
		li.add("kiwi");
		li.add("grapes");

		List<Object> li2 = new ArrayList<Object>();
		li2.add("mango");
		li2.add("orange");
		li2.add("kiwi");
		li2.add("grapes");

		boolean flag = li.containsAll(li2);
		System.out.println(flag);
	//	li.clear();
	//	System.out.println(li);
		li.remove(2);
		System.out.println(li);
	}
}
