package Class_16_StringMethods;

public class StringMethods6 {
	public static void main(String[] args) {
		String str = "selenium java tools";
		String str1 = str.replace('s', 'h');// With replace we will be able to replace a String also and replace a
											// character also
		System.out.println(str1);
		String str2 = str.replaceAll("java", "python");// with replaceall we will be able to replace the String only
		System.out.println(str2);
	}
}
