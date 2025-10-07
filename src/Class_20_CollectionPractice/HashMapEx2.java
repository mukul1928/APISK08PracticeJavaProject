package Class_20_CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(12, "tom");
		m.put(32, "harry");
		m.put(42, "matt");
		m.put(19, "john");
		
		System.out.println(m);
		
		int x = m.size();
		System.out.println(x);
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(43, "zen");
		m1.put(65, "elisa");
		m1.put(42, "matt");
		m1.put(19, "john");
		System.out.println(m.get(19));// It will give you the value of key 19
		m.putAll(m1);// It is going to merge two maps
		System.out.println(m);
	   boolean flag =	m.containsKey(32);
	   System.out.println(flag);
	   m.remove(42);
	   System.out.println(m);
	   m.replace(19, "Kelly");
	   System.out.println(m);
	   
	}
}
