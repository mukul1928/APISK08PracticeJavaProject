package MyProject1;

class Student {
	String name;
	int id;
	float salary;
	boolean IsMarried;

	Student(String name, int id, float salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	Student(String name, int id, float salary, boolean IsMarried) {

		this(name, id, salary);
		this.IsMarried = IsMarried;
	}

	void display() {
		System.out.println(name + " " + id + " " + salary + " " + IsMarried);
	}
}

public class ThisKeywordEx_Class13 {
	public static void main(String[] args) {
		Student obj = new Student("Rohan", 1234, 800000f, false);
		obj.display();

	}
}
