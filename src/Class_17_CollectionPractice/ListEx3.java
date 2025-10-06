package Class_17_CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
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

		li.addAll(li2);//add all method is going to merge the elements of both of the lists
		for (String x : li) {
			System.out.println(x);
		}
	}
}
