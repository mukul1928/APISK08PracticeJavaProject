package Class_12;
//Multi Level Inheritance
class F6 {
	void test() {
		System.out.println("F6 Method");
	}
}

class F3 extends F6 {
	void test() {
		System.out.println("Hello");
	}

	void display1() {
		super.test();
		test();
	}
}

class F4 extends F3 {
	void test() {
		System.out.println("Hi");
	}

	void message() {
		System.out.println("Java");
	}

	void display()// Inside one method we are calling two methods together this process called as
				// Method Cascading (#test & #message)
	{
		super.test();// this will call the F3 class method with the help of this super keyword,
						// super keyword is to use to call the members of its immediate parent class
		test();
		message();
	}
}

public class UsingSuperKeywordWithMethod_Class12 {
	public static void main(String[] args) {
		F4 obj = new F4();
		obj.display();
		obj.test();
		obj.message();
		obj.display1();
	}
}
