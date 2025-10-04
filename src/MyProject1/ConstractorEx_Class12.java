package MyProject1;

class E1 {
	E1() {
		System.out.println("This is a default Constructor");
	}

	void display() {
		System.out.println("Hello");
	}
}

public class ConstractorEx_Class12 {
	public static void main(String[] args) {
		E1 obj = new E1();
		obj.display();
	}
}
