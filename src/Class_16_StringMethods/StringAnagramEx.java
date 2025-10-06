package Class_16_StringMethods;

import java.util.Arrays;

public class StringAnagramEx {
	public static void main(String[] args) {
		String str = "Grab";
		String str1 = "brag";
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		if (str.length() != str1.length()) {
			System.out.println("Not Anagram");
		} else {
			char[] ch = str.toCharArray();
			char[] ch1 = str1.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean flag = Arrays.equals(ch, ch1);
			if (flag == true) {
				System.out.println("Both String are Anagrams");
			} else {
				System.out.println("Both String are not an Anagrams");
			}
		}

	}
}
