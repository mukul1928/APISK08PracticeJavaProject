package Class_20_CollectionPractice;

//In case of a HashMap the ordering is not maintained but in case of a LinkedHashMap the Ordering is maintained
//HashMap internally uses a HashTable for implementation whereas LinkedHashMap internally uses a Doublly LinkedList for implementation
//Insertion and Deletion will be faster in LinkedHashMap 
//Storing will be faster in HashMap

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx3 {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(12, "tom");
		m.put(32, "harry");
		m.put(42, "matt");
		m.put(19, "john");

		for (Map.Entry x : m.entrySet()) {
			System.out.print(x.getKey() + " : ");
			System.out.println(x.getValue());
		}
	}
}
