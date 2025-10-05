package Class_16_StringMethods;

public class StringMethods {
	public static void main(String[] args) {
		String str = "India";
		// char ch = str.charAt(2);
		// System.out.println(ch);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
