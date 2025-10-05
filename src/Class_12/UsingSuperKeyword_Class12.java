package Class_12;
class F1
{
	String colour = "red";
}
class F2 extends F1
{
	void display() {
		String colour = "blue";
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
public class UsingSuperKeyword_Class12 {
	public static void main(String[] args) {
		F2 obj = new F2();
		obj.display();
	}
}
