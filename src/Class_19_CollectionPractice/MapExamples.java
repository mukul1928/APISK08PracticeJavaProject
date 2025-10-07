package Class_19_CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(12, "apple");
		m.put(42, "banana");
		m.put(2, "melon");
		m.put(9, "kiwi");
		m.put(null, null);
		m.put(null, "orange");
		m.put(62, "banana");
		m.put(82, "melon");
		m.put(19, "kiwi");

		// System.out.println(m);
		/*
		 * If you want to convert this Map and if you want to use in a Key Values pair
		 * then At first you have to convert this Map into an EntrySet In order to
		 * convert a Map into a EnterSet you have to use an Entry Interface.
		 */
		for (Map.Entry x : m.entrySet()) {
			System.out.print(x.getKey() + " ");
			System.out.println(x.getValue());
		}
	}
}
