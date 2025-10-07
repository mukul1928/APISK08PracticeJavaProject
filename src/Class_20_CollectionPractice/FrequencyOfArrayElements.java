package Class_20_CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
	public static void main(String[] args) {
		int[] a = { 13, 14, 13, 13, 15, 14 };
		Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();

		for (Integer x : a) {
			if (mp.containsKey(x)) {
				mp.put(x, mp.get(x) + 1);
			} else {
				mp.put(x, 1);
			}
		}
		for (Map.Entry x : mp.entrySet()) {
			System.out.print(x.getKey() + " : ");
			System.out.println(x.getValue());
		}
	}
}
