package Class_16_StringMethods;

public class StringReverseAndPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse of String is " + rev);
		if (str.equals(rev)) {
			System.out.println("Both Strings are Palindrome");
		} else {
			System.out.println("Both Strings are not a Palindrome");
		}
	}
}
