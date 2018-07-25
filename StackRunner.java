package com.datatstructure.stack;

import java.util.Random;

public class StackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		System.out.println("Stack is Empty: "+s.isEmpty(s.top));
		int x=0;
		for(int i=0;i<10;i++){
			x=new Random().nextInt(10000);
			if(!s.push(x)){
				System.out.println("Array limit has been reached");
				break;
			}
			System.out.println("Inserting "+x+" at index ["+i+"]");
		}
		System.out.println("Size of Stack is "+s.size());
		System.out.println("Currently Top points at "+s.top);
		System.out.println("Top elemet is "+s.peek());
		for(int i=0;i<10;i++){
			if(s.pop()==-1123125)
				break;
			System.out.println("Removing element from Stack: "+ s.pop());
		}
		
		System.out.println("Size of Stack is "+s.size());
		System.out.println("Currently Top points at "+s.top);
		System.out.println("Top elemet is "+s.peek());
	}

}
