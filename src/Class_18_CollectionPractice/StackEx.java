package Class_18_CollectionPractice;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Object> s1 = new Stack<Object>();
		s1.push(56);
		s1.push("apple");
		s1.push(false);
		s1.push(60000f);

		s1.pop();// For removing the last element we use this so 60000f will be removed
		System.out.println(s1);
		System.out.println(s1.peek());
	}
}
