package Class_20_CollectionPractice;

//TreeMap internally uses a Binary Tree for implementation
//In case of a TreeMap by default the order of the elements will be stored in assccending order

import java.util.Map;
import java.util.TreeMap;

public class MapEx4 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(12, "tom");
		tm.put(20, "harry");
		tm.put(42, "matt");
		tm.put(9, "john");

		for (Map.Entry x : tm.entrySet()) {
			System.out.print(x.getKey() + " : ");
			System.out.println(x.getValue());
		}
		System.out.println();
		System.out.println("Printing the values in descending order :");
		
		System.out.println(tm.descendingMap());
	}
}
