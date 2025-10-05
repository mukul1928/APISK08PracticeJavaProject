package MyProject1;

class E5 {
	static int sum(int x, int y) {
		return x + y;
	}

	static int diff(int a, int b) {
		return a - b;
	}
}

public class StaticMethodEx2_Class13 {
	public static void main(String[] args) {
		System.out.println(E5.sum(23, 45));
		System.out.println(E5.diff(64, 34));
	}
}
