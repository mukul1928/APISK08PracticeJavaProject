package Class_17_CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(23);
		li.add(56);
		li.add(67);
		li.add(90);
		System.out.println(li);// 1st way to print the value
		
		for (Integer x : li) // with the help of this for each loop we can print the values by another way
		{
			System.out.println(x);
		}
		//third way to print the values with the help of Iterator interface
		//Iterator is a kind of Interface which helps you to print all the elements of an Arraylist
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
