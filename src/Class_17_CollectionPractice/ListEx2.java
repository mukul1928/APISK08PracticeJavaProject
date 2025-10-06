package Class_17_CollectionPractice;

//Def of Arraylist:= Arraylist is a class which implements List interface 
//an Arraylist is something which always stored the elements in a ordered way
//insertion and deletion is also occured in a ordered way
//Arraylist can store duplicate elements also 

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add(34);
		li.add("apple");
		li.add('A');
		li.add(false);
	}
}
