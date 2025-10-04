package MyProject1;
class G1
{
	static String comName = "TCS";
	int id;
	float salary;
	G1(int i,float s){
		id = i;
		salary = s;
	}
	void display() {
		System.out.println(id+" "+salary+" "+comName);
	}
}
public class StaticVariableEx_Class12 {
	public static void main(String[] args) {
		G1 obj = new G1(1234,78000f);
		G1 obj1 = new G1(5678,80000f);
		obj.display();
		obj1.display();
	}
}
