package Class_12;
//Hireriacal Level Inheritance
class D5 {
	void display() {
		System.out.println("Hello");
	}
}

class D6 extends D5 {
	void test() {
		System.out.println("Hi");
	}
}

class D7 extends D5 {
	void message() {
		System.out.println("Java");
	}
}

public class Inheritance_Ex3_Class12 {
	public static void main(String[] args) {
			D6 obj = new D6();
			obj.display();
			obj.test();
			D7 obj1 = new D7();
			obj1.message();
	}
}
