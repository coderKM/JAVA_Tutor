package LEC1113;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lec1113 {

	public static void main(String[] args) {

		System.out.println("** Iterator **");
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(7);
		a.add(8);
		a.add(4);
		// Iterator of collection
		Iterator<Integer> itr = a.iterator();

		// does it have any next element?
		System.out.println("** for each **");
		for (int temp : a) {
			System.out.print(temp + " ");
		}
		//
		// System.out.println("** Iterator **");
		// while(itr.hasNext()){
		// System.out.println(itr.next());
		// }
		//

		System.out.println("\n*** Stack ***");
		// Stack = LIFO (Last in First out)
		Stack<Integer> stk = new Stack<>();
//		System.out.println(stk.peek());
		// where in real life use stack?

		System.out.println("\n*** Queue ***");
		// Queue = FIFO ( Guess !)

		// simple Queue
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		que.add(5);
		System.out.println(que.peek());
		que.add(9);
		que.add(3);
		System.out.println(que.peek());

		// priority queue => order b
		Queue<Integer> p_que = new PriorityQueue<>();
		p_que.add(3);
		p_que.add(7);
		p_que.add(1);
		p_que.add(2);

		// -?
		System.out.println(p_que.toString());
		// where in real life use queue?
		Set<Integer> s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(1);	
		s.add(5);

		for(int in = 0; in < 20; in++){
		System.out.println("** Set **");
		for(int i : s){
			System.out.println(i + " ");
		}
		}
	}
}
