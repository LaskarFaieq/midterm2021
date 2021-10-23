package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("VA");
		queue.add("CA");
		queue.add("MD");
		queue.add("LA");
		queue.add("PA");
		queue.add("NY");

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());

		System.out.println("Use of for each Loop to Retrieve Data: ");
		Iterator itr = queue.iterator();
		while (itr.hasNext()){
			String i = (String) itr.next();
			System.out.println(i);
		}

	}

}
