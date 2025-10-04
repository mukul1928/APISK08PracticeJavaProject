package MyProject1;
//Single Level Inheritance
class c1
{
	void dislay() {
		System.out.println("Hello");
	}
	void message() {
		System.out.println("Hi");
	}
}
class c2 extends c1
{
	void test() {
		System.out.println("Hey");
	}
}
public class Inheritance_Class12 {
	public static void main(String[] args) {
		c2 obj = new c2();
		obj.dislay();
		obj.message();
		obj.test();
	}
}
