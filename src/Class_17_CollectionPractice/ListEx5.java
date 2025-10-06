package Class_17_CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("mango");
		li.add("orange");
		li.add("kiwi");
		li.add("grapes");

		System.out.println(li.get(2));
		li.set(3, "melon");
		System.out.println(li);
		boolean flag = li.contains("orange");
		System.out.println("does list contains orange: " + flag);
	}
}
