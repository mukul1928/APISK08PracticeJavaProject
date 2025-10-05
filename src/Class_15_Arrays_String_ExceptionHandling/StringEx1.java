package Class_15_Arrays_String_ExceptionHandling;
//String are basically stored in a Heap memory it has two part one is pooled heap memory and non pooled heap memory 
//if you are declaring a Stirng with the help of a String literal it is going to get stored in the String constraints pool of pooled heap memory
//if you are declaring a String with the help of a New keyword it is going to get stored in the non pooled heap memory
public class StringEx1 {
	public static void main(String[] args) {
		String str = "Republic";//This is the first way of declaring a String with the help of String literals
		String str1 = new String("India");//2nd way to declaring the String by the help of new keyword
	}
}
