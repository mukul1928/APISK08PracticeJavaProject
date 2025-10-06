package Class_18_CollectionPractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		q.add("john");
		q.add("harry");
		q.add("tom");
		System.out.println(q);
		q.remove();
		System.out.println(q);
	}
}
