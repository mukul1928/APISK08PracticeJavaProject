package Class_16_StringMethods;

//Once its being stored in the String constraints pool so 
//we will not be able to change its (str) values untill & unless 
//we are not re-assigning to a different variable this values will not be changed 
//that is why we call String as an immutable class in java

public class StringEx {
	public static void main(String[] args) {
		String str = "Chandan";
		str = str.concat(" Pandey");
		System.out.println(str);
	}
}
