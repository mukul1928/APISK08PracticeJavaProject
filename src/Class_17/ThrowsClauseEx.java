package Class_17;
class T4
{
	public static void display() throws InterruptedException {
		System.out.println("Hello");
		Thread.sleep(3000);
	}
}
public class ThrowsClauseEx {
	public static void main(String[] args) throws InterruptedException {
		T4.display();
	}
}
