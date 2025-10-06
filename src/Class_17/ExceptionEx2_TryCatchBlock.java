package Class_17;

public class ExceptionEx2_TryCatchBlock {
	public static void main(String[] args) {
		try {
			String str = null;
			int x = str.length();
		} catch (Exception e) {
			System.out.println("Cought with" + e);
		}
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
}
