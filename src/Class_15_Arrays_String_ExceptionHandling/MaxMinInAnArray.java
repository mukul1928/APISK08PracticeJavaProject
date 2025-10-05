package Class_15_Arrays_String_ExceptionHandling;

class test {
	public static int MaxorMin(int a[], int total) {
		for (int i = 0; i < a.length; i++)// i=0,0<4//i=1,i<4
		{
			for (int j = i + 1; j < a.length; j++) // j=1,1<4//j=3,3<4//j=4,4<4
			{
				if (a[i] > a[j]) // a[0]>a[1]////a[0]>a[2]//a[0]>a[3]
				{
					int temp = a[i];// a[1]>a[2]//a[1]>a[3]
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// return a[4 - 1];//4th smallest
		return a[total - 4];// 4th largest
	}
}

public class MaxMinInAnArray {
	public static void main(String[] args) {
		int[] a = { 12, 1, 7, 14, 22, 4 };
		int y = a.length;
		System.out.println(test.MaxorMin(a, y));
	}
}
