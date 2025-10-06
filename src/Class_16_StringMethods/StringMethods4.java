package Class_16_StringMethods;

public class StringMethods4 {
	public static void main(String[] args) {
		String str = "1234saurabhtest@#$%";
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
	}
}
