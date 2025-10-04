package MyProject1;

public class MyPractice1 {
	public static void main(String[] args) {
		int x = 10;
		int y = x++;// This is kind of a POST INCREMENT OPERATOR In post increment operator first
					// value will be assign to a variable and then later on it will be incremented
		// int y = ++x; // This is a example of a PREFIX INCREMENT OPERATOR

		/*
		 * System.out.println(y);
		 * 
		 * int x1 = 10; int y1 = 20; int z1 = 30;
		 * 
		 * int res = x1++ + y1++ - z1-- - --y1 - --x1; System.out.println(res);
		 */

		int x2 = 5;
		int y2 = 8;
		int z2 = 7;
		int resu = z2-- + x2-- + y2-- + --z2 + --y2 + --x2;
		System.out.println(resu);
	}
}
