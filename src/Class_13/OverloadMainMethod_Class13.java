package Class_13;

public class OverloadMainMethod_Class13 {

	public static void main(String str) {
		int x = str.length();
		System.out.println(x);
	}

	public static void main(String[] args) // The execution of a program will always start to that main method which is
											// having a array of a String as an argument to that
	{
		System.out.println("Hello");
	}
}
