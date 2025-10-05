package Class_15_Arrays_String_ExceptionHandling;

public class ArrayDeclaration {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6 };
		int[] b = new int[] { 23, 56, 78, 99 };
		String[] s = { "chandan", "mukul" };
		for (int i = 0; i < a.length; i++)//i = 0,0 < 5
		{
			System.out.print(a[i]+" ");
		}
	}
}
