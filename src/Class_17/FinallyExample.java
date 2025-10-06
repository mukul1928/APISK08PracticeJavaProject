package Class_17;

public class FinallyExample {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x / y;
			System.out.println(z);
		} // catch (Exception e) {
			// System.out.println("Caught with " + e);
		// }
		finally // it is basically that block of code which is always going to execute whether
				// an exception has occured and not handled
				// whether an exception has occured and handled or whether no exception has
				// occured
		{
			int p = 20;
			int q = 30;
			int r = p * q;
			System.out.println(r);
		}
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}
}
