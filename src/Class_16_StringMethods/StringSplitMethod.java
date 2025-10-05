package Class_16_StringMethods;

public class StringSplitMethod {
	public static void main(String[] args) {
		/*
		 * String str = "Chandan@Test@Architect@Java"; String[] s1 = str.split("@");
		 * System.out.println(s1[0]);// Chandan System.out.println(s1[1]);// Test
		 * System.out.println(s1[2]);// Archtect System.out.println(s1[3]);// Java
		 */

		String str = "testnewtools";
		// int x = str.indexOf('t');//will give you the index of that particular letter
		// so t is in 0th index so output = 0
		int x = str.indexOf('t', 2);// it will going to start checking the index of t after 2nd index but from the
									// left hand side so in test it will take the last t which is besides of s.
									// if the character will not be present in the String then it will return the -1
		System.out.println(x);

	}
}
