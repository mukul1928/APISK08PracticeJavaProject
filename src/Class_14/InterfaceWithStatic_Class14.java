package Class_14;

interface I10 {
	static int sum(int x, int y) {
		return x + y;
	}

	default void display() {
		System.out.println("Hello");
	}
}

class C11 implements I10 {
	void mul() {
		int x = 54;
		int y = 38;
		System.out.println(x*y);
		
	}
}

public class InterfaceWithStatic_Class14 {
	public static void main(String[] args) {
		System.out.println(I10.sum(23, 42));
		I10 ref = new C11();
		ref.display();
		C11 ob = new C11();
		ob.mul();
	}
}
