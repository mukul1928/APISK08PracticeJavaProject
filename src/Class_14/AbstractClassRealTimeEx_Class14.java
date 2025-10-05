package Class_14;

abstract class Employee2 {
	int id;
	String name;
	String address;
	float salary;

	void displayId() {
		System.out.println("My ID");
	}

	abstract void salary();
}

class P1 extends Employee2 {
	void salary() {
		int basic = 30000;
		int hra = 32000;
	}
}

public class AbstractClassRealTimeEx_Class14 {

	public static void main(String[] args) {

	}
}
