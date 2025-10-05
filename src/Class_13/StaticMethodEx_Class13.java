package Class_13;
//A static method is such kind of a method which get loaded at the time of a class loading
//In case of a static method we don't have to create a object of that class 
//and we will be able to access that method by the classname.methodname
//Inside a static method we will not ab able to change the normal variable value 
class E3 {
	static int x = 10; // the variable has to be the static here then only in line no 11 we can update its value from 10 to 15
	static void display()
	{
		System.out.println("Java");
		x=15;
	}
}

public class StaticMethodEx_Class13 {
	public static void main(String[] args) {
		E3.display();
	}
}
