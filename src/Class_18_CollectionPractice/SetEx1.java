package Class_18_CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(67);
		s.add(99);
		s.add(102);
		s.add(34);
		s.add(67);
		System.out.println(s);
	}
}
