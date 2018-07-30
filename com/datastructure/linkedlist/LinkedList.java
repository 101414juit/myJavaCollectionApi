package com.datastructure.linkedlist;

public class LinkedList<E> {
	private static int size;
	private Node<E> head;
	
	static{
		size=0;
	}
	
	public void add(E data){
		Node<E> node = new Node<E>(data,null);
		
		if(head==null){
			head=node;			
		}
		else if (head!=null){
			Node<E> tempNode=head;
			while(tempNode.getNext() !=null)
				tempNode=tempNode.getNext();
			tempNode.setNext(node);
		}
		getIncrementSize();
	}
	
	
	public void print(){
		if(head==null)
			throw new IndexOutOfBoundsException("List is Empty");
		System.out.println("Data is:\t"+ head.getData());
		while(head.getNext()!=null){
			head=head.getNext();
			System.out.println("Data is:\t"+ head.getData());
		}
	}
	private static int getIncrementSize(){
		return size++;
	}
	
	private static int getDecrementSize(){
		return size--;
	}
	
	public int size(){
		return size;
	}
	
}

