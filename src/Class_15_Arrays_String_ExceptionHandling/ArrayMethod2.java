package Class_15_Arrays_String_ExceptionHandling;

import java.util.Arrays;

public class ArrayMethod2 {
	public static void main(String[] args) {
		int[] a = { 102, 356, 943, 978 };
		int[] b = { 102, 356, 1043, 1078 };
		boolean flag = Arrays.equals(a, b);
		System.out.println(flag);

		int x = Arrays.compare(a, b);// It does a Laxicographic comparision at first it will compare the first two
									// elements if both are same then only it will go to the next element for
									// comparision Ex: here is line 7 first element is 12 and in line 8 the first
									// element is 12 so both are same here then it will go to the next element and
									// do the comparision
		System.out.println(x);
	}
}
