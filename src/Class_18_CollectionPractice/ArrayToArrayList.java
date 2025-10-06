package Class_18_CollectionPractice;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String [] city = {"Delhi", "Hyderabad","Bangalore", "Mumbai"};
		List li = Arrays.asList(city); // This is the method to converting of Array to ArrayList
		System.out.println(li);
	}
}
