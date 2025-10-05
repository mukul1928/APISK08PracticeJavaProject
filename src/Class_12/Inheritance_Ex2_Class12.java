package Class_12;

//Multi Level Inheritance
class D2 {
	void test() {
		System.out.println("Hi");
	}

	void display() {
		System.out.println("Hello");
	}
}

class D3 extends D2 {
	void message() {
		System.out.println("This is Chandan Pandey");
	}
}

class D4 extends D3 {
	void test1() {
		System.out.println("Hey this is Java");
	}
}

public class Inheritance_Ex2_Class12 {
	public static void main(String[] args) {
		D4 obj = new D4();
		obj.test();
		obj.display();
		obj.message();
		obj.test1();
	}
}
