package Class_20_CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfString {
	public static void main(String[] args) {
		String str = "Indian";
		str = str.toLowerCase();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (Character x : ch) {
			if (m.containsKey(x)) {
				m.put(x, (m.get(x) + 1));
			} else {
				m.put(x, 1);
			}
		}
		for (Map.Entry x : m.entrySet()) {
			System.out.print(x.getKey() + " : ");
			System.out.println(x.getValue());
		}
	}
}
