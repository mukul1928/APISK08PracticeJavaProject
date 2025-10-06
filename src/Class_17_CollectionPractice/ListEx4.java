package Class_17_CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add("mango");
		li.add("orange");
		li.add("kiwi");
		li.add("grapes");

		List<String> li2 = new ArrayList<String>();
		li2.add("pines");
		li2.add("guava");
		li2.add("apple");
		li2.add("banana");
		li2.add("kiwi");

		List<Object> li3 = new ArrayList<Object>();
		li3.add(23);
		li3.add(56);
		li3.add(67);
		li3.add(90);

		li.addAll(li2);

		for (Object x : li) {
			System.out.println(x);
		}

		System.out.println("Merging Integer and String ArrayList");
		li.addAll(li3);
		System.out.println(li);
	}
}
