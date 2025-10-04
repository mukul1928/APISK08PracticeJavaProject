package MyProject1;

public class TernaryOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		int z = 20;
		int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(max);
	}
}
