package com.demo.test;

import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {

      Map<String,Integer> tm=new TreeMap<>();
      tm.put("Shamim",12);
      tm.put("Ganesh", 13);
      tm.put("Chhailu", 14);
      tm.put("GajendraKumar", 15);
      System.out.println(tm);
      Stack<Integer> stack = new Stack<>();
 
      stack.push(12);
      stack.push(14);
      stack.push(46);
      
      System.out.println(stack.peek());
      System.out.println(stack);
      System.out.println(stack.pop());
      
      LinkedList<Integer> ll=new LinkedList<>();
      
      ll.add(78);
      ll.add(78);
      ll.add(89);
      ll.add(16);
      
      System.out.println(ll);
      ll.remove();
      System.out.println(ll);
      ll.removeLast();
      System.out.println(ll);
      ll.addFirst(99);
      System.out.println(ll);
      
    Queue<Integer> que=new LinkedList<>();
    System.out.println("Queue");
    que.add(12);
    que.add(78);
    que.add(56);
    que.add(11);
    System.out.println(que);
    System.out.println("Using Poll "+que.poll());
    System.out.println(que);
    
    
    Queue<Integer> pq=new PriorityQueue<>();
//    
//    pq.add(12);
//    pq.add(78);
//    pq.add(56);
//    pq.add(11);
    pq.offer(13);
    pq.offer(78);
    pq.offer(8);
    pq.offer(11);
  //  pq.offer(33);
    System.out.println("Priority Que ::");
    System.out.println(pq);
    System.out.println("Using Poll "+pq.poll());
    System.out.println(pq);
	}

}
