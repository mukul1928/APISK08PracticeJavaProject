package Class_17;

class T1 {
	public void validateAge(int a) {
		if (a < 18) {
			throw new ArithmeticException("Age is not correct");
		} else {
			System.out.println("Age is validated");
		}
	}
}

public class UsingThrowClause {
	public static void main(String[] args) {
		T1 obj = new T1();
		obj.validateAge(18);// If I pass here 12 or any other age which is lesser than 18 then it will throw
							// an ArithmeticException
	}
}
