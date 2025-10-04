package MyProject1;

public class LogicalOperator {
	public static void main(String[] args) {
		int a = 10, b = 15, c = 20;
		if (a < b && c > b && a > c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if (a < b || c < b || a > c) {
			System.out.println("Or Operator Yes Condition");
		} else {
			System.out.println("Or Operator No Condition");
		}

	}
}
