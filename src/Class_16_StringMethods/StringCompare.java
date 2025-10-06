package Class_16_StringMethods;

public class StringCompare {
	public static void main(String[] args) {
		String str = "ASelenium";
		String str1 = "selenium";
		boolean flag = str.equals(str1);// if in place of equals there would have equalIgnoreCases then we are going to
										// ignore the upper and lower case
		System.out.println(flag);
		int x = str.compareTo(str1);
		System.out.println(x);
	}
}
