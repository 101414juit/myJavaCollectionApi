package com.datastructure.linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll =new LinkedList<Integer>();
		System.out.println("Initial Capacity:\t"+ll.size());
		
		ll.add(2310);
		ll.add(10234);
		ll.add(1023);
		ll.add(1530);
		ll.add(510);
		ll.add(103);
		ll.add(120);
		
		System.out.println("Current Capacity:\t"+ll.size());
		ll.print();
	}

}
