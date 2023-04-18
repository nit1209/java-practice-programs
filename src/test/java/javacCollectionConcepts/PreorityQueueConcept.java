package javacCollectionConcepts;

import java.util.PriorityQueue;

public class PreorityQueueConcept {

	public static void main(String[] args) {
		
		
		PriorityQueue<Object> q= new PriorityQueue<Object>();
		q.add(10);
		q.add(1230);
		q.add(34);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);

	}

}
