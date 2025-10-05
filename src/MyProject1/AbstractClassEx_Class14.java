package MyProject1;

abstract class G2 {
	void display() {
		System.out.println("Hello");
	}

	abstract void test();
}

class G3 extends G2 {

	void test() {
		System.out.println("How Are You ?");
	}

}

public class AbstractClassEx_Class14 {
	public static void main(String[] args) {
		/*
		 * G3 obj = new G3(); obj.display(); one way to call the methods obj.test();
		 */

		G2 obj = new G3(); // another way to call the methods, this referential variable calling methed is
							// only applicable to the absrtact class not all the methods
		obj.display();
		obj.test();
	}
}
