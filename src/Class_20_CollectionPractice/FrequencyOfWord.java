package Class_20_CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfWord {
	public static void main(String[] args) {
		String str = "Tip Tap toe tip tip tap";
		str = str.toLowerCase();
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		String[] s1 = str.split(" ");
		for (String x : s1) {
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
		int maxCount = 0;
		int minCount = 9999;
		String maxElement = "abcd";
		String minElement = "efgh";
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			String key = entry.getKey();
			int count = entry.getValue();
			if (count > maxCount) {
				maxCount = count;
				maxElement = key;
			}
			if (count < minCount) {
				minCount = count;
				minElement = key;
			}
		}
		// print results
		System.out.println("Max occurring element: " + maxElement + " (count = " + maxCount + ")");
		System.out.println("Min occurring element: " + minElement + " (count = " + minCount + ")");
	}
}
