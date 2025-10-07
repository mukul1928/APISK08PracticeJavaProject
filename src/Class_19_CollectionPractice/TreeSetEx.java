package Class_19_CollectionPractice;

import java.util.TreeSet;

//TreeSet is such kind of a Set which by default stores the elements in an Accending order 
//and it internally using a Binary tree for implementation
//it will not allow any kind of a dupliacate values to get stored it can not store any null value.
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> s1 = new TreeSet<Integer>();
		s1.add(123);
		s1.add(198);
		s1.add(106);
		s1.add(108);
		System.out.println(s1);
		System.out.println("Reversing the order");
		System.out.println(s1.descendingSet());//The order will be reversed
	}
}
