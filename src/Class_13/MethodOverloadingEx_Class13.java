package Class_13;

//We can't have two same method inside the same class with same name and same data types once you have multiple methods
//either the number of the parameters of the method will be different or the data type of the parameters will be different
//that process is set to be called as Method Overloading
class E6 {
	static int sum(int x, int y, int z) {
		return x + y;
	}

	static float sum(int a, int b, float c) {
		return a + b + c;
	}
}

public class MethodOverloadingEx_Class13 {
	public static void main(String[] args) {
		System.out.println(E6.sum(23, 43, 33));
		System.out.println(E6.sum(34, 77, 87.333f));
	}
}
