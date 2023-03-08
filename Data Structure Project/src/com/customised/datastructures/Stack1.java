package com.customised.datastructures;

public class Stack1 {
	int top=-1,cap;
	int[]stack;
	public Stack1(int cap)
	{
		this.cap=cap;
		stack=new int[this.cap];
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(top==cap-1)
		{
			return true;
		}
		return false;
	}
	public void push(int ele)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			stack[top]=ele;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			top--;
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(stack[top]);
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
	}

}
