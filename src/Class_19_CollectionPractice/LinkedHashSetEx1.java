package Class_19_CollectionPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx1 {
	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<String>();
		s1.add("banana");
		s1.add("orange");
		s1.add("apple");
		s1.add("melon");
		s1.add("guava");

		System.out.println(s1);
	}
}
