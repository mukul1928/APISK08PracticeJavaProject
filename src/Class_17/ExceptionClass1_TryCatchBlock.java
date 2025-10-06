package Class_17;

public class ExceptionClass1_TryCatchBlock {
	public static void main(String[] args) {
		try {
			int x = 9 / 0;
			System.out.println(x);// ArithmeticException
		} catch (Exception e) {
			System.out.println("caught with " + e);
		}
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
}
