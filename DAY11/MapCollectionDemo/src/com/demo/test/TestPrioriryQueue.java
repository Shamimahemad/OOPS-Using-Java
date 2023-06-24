package com.demo.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPrioriryQueue {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue();
		queue.offer(23);
		queue.offer(34);
		queue.offer(11);
		queue.offer(45);
		queue.offer(34);
		System.out.println(queue);
		Comparator<Integer> c=(o1,o2)->{
			System.out.println("in comparator"+o1+"-----"+o2);
			if(o1<o2)
				return -1;
			else if(o1==o2)
					return 0;
				else
					return 1;
						
		};
		PriorityQueue<Integer> q1=new PriorityQueue<>(c);
		q1.offer(23);
		q1.offer(34);
		q1.offer(11);
		q1.offer(45);
		q1.offer(34);
		System.out.println(q1);
	}

}
