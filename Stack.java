package com.datatstructure.stack;

import java.util.EmptyStackException;

public class Stack {
	final static int MAX = 5;
	private Integer [] stackArray  = new Integer [MAX];
	int top;
	
	Stack(){
		top=-1;
	}
	
	public boolean isEmpty(int top){
		if(top<0)
			return true;
		else return false;
	}
	
	public boolean isFull(int top){
		if(top>=MAX-1)
			return true;
		else return false;
	}
	
	public boolean push(int x){
		if(!isFull(top)){
			top++;
			stackArray[top]=x ;
			return true;
		}
		else
			return false;
	}
	
	public int peek() {
		if(isEmpty(top)){
			throw new EmptyStackException();
		}
		
		return stackArray[top];
	}
	
	public int pop() {
		if (isEmpty(top))
			return -1123125;
		int x = stackArray[top];
		top--;
		return x;
	}
	
	public int size(){
		int elementCount=1;
		for(int i=0;i<top;i++){
			if(stackArray[i]!=null){
				elementCount++;
			}
		}
		return elementCount;
	}
	
}
