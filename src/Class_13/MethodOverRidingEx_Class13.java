package Class_13;
class Bank
{
	int getROI(int x, int y) {
		return x + y;
	}
}
class SBI extends Bank
{
	int getROI(int x, int y) {
		return x + y;
	}
}
class HDFC extends Bank
{
	int getROI(int x, int y) {
		return x + y;
	}
}
public class MethodOverRidingEx_Class13 {
	public static void main(String[] args) {
		Bank obj = new Bank();
		System.out.println(obj.getROI(6, 7));
		HDFC obj1 = new HDFC();
		System.out.println(obj1.getROI(8, 9));
	}
}
