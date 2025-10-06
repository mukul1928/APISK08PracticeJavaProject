package Class_18_CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListEx8 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(34);
		li.add(56);
		li.add(16);
		li.add(46);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(134);
		li2.add(156);
		li2.add(16);
		li2.add(46);
		
		li.removeAll(li2);
		System.out.println(li);
	}
}
