package com.datatstructure.stack;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class Stack<T> {
	final static int MAX = 5;
	private T [] stackArray ;// = new T [MAX];
	int top;
	
	@SuppressWarnings("unchecked")
	Stack(Class<T> c){
		top=-1;
		stackArray= (T[]) Array.newInstance(c, MAX);
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
	
	public boolean push(T x){
		if(!isFull(top)){
			top++;
			stackArray[top]=x ;
			return true;
		}
		else
			return false;
	}
	
	public T peek() {
		if(isEmpty(top)){
			throw new EmptyStackException();
		}
		
		return stackArray[top];
	}
	
	public T pop() {
		//needs to be implemented below method
//		if (isEmpty(top))
//			return -1123125;
		T x = stackArray[top];
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
