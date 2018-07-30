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
	
	//Need to complete this method
	public void remove (E data){
		if(head==null)
			System.out.println("List has not been created!! Cannot delete data");
		Node<E> tempNode=head;
		int counter=0;
		do{
			if(counter==0){
				head=tempNode.getNext();
				break;
			}else if( tempNode.getNext().getData()!=null && tempNode.getNext().getData().equals(data) ){
				if(tempNode.getNext().getNext()==null)
					tempNode.setNext(null);
				else
					tempNode.setNext(tempNode.getNext().getNext());
				break;
			}
			tempNode=tempNode.getNext();
		}while(tempNode.getNext()!=null);
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

