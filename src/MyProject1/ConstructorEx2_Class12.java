package MyProject1;
//Constructor Overloading
class E2 {
	int id;
	String name;
	float salary;

	E2(int i, String n) {
		id = i;
		name = n;
	}

	E2(int x, String m, float s) {
		id = x;
		name = m;
		salary = s;
	}

	void display() {
		System.out.println(name + " " + id + " " + salary);
	}
}

public class ConstructorEx2_Class12 {
	public static void main(String[] args) {
		E2 obj = new E2(1234, "Harry");
		obj.display();
		E2 obj1 = new E2(3456, "Tom", 78000f);
		obj1.display();
	}

}
