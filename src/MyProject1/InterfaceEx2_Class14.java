package MyProject1;

interface I4 {
	void display();

	void test();
}

interface I5 extends I4 {
	void message();
}

class G4 implements I5 {
	public void display() {
		System.out.println("Hi");
	}

	public void test() {
		System.out.println("Hello");
	}

	public void message() {
		System.out.println("How are you ?");
	}
}

public class InterfaceEx2_Class14 {
	public static void main(String[] args) {

	}
}
