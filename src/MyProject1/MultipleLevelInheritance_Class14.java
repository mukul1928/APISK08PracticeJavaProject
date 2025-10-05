package MyProject1;

interface I8 {
	void test();
}

interface I9 {
	void display();
}

class C10 implements I8, I9 {
	public void test() {
		System.out.println("Hi");
	}

	public void display() {
		System.out.println("Hello");
	}
}

public class MultipleLevelInheritance_Class14 {

	public static void main(String[] args) {
		I8 ref = new C10();
		ref.test();
		I9 reff = new C10();
		reff.display();
		
		// Or //
		
		C10 refr = new C10();
		refr.test();
		refr.display();
	}
}
