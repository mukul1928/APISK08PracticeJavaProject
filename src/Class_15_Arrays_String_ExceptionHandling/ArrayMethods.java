package Class_15_Arrays_String_ExceptionHandling;

import java.util.Arrays;

public class ArrayMethods {
	public static void main(String[] args) 
	{
		int[] a = { 34, 12, 22, 56 };
		/*
		 * Arrays.sort(a); for (int i = 0; i < a.length; i++) System.out.print(a[i] +
		 * " ");
		 */
		for (int i = 0; i < a.length; i++)//i=0,0<4//i=1,i<4
		{
			for (int j = i + 1; j < a.length; j++) //j=1,1<4//j=3,3<4//j=4,4<4
			{
				if (a[i] > a[j]) // a[0]>a[1]////a[0]>a[2]//a[0]>a[3]
				{
					int temp = a[i];//a[1]>a[2]//a[1]>a[3]
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
