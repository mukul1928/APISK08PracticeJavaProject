package Class_19_CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("orange");
		s1.add("apple");
		s1.add("melon");
		s1.add("guava");

		Set<String> s2 = new HashSet<String>();
		s2.add("orange");
		s2.add("apple");
		s2.add("melon");
		s2.add("guava");
		s2.add("papaya");
		
		s1.addAll(s2);//merging the two sets (will represent union of set)
		System.out.println(s1);
		
		s1.removeAll(s2);
		System.out.println(s1);//differences of set
		
		s1.retainAll(s2);
		System.out.println(s1);//intersection in both of sets
		
		boolean flag = s1.containsAll(s2);
		System.out.println(flag);
		
		boolean flag1 = s1.contains("melon");
		System.out.println(flag1);
		
		s1.remove("guava");
		System.out.println(s1);
		
		
	}
}
