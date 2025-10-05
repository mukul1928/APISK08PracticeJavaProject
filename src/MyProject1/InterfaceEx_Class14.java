package MyProject1;
interface I2
{
	void test();
	void message();
	int x = 10;
}
class C5 implements I2
{

	public void test() {
		System.out.println("Hello");
	}

	public void message() {
		System.out.println("Hi");
	}
	
}
public class InterfaceEx_Class14 {
	public static void main(String[] args) {
		I2 ref = new C5();
		ref.test();
		ref.message();
	}
}
