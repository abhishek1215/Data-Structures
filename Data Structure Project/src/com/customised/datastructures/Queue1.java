package com.customised.datastructures;

public class Queue1 {
	int cap,front,rear;
	int []que;
	public Queue1(int cap)
	{
		this.cap=cap;
		que=new int[this.cap];	
	}
	public boolean isEmpty()
	{
		if(rear==front)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(rear==cap)
		{
			return true;
		}
		return false;
	}
	public void enQue(int ele)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			que[rear++]=ele;
		}
	}
	public void deQue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			for(int i=front;i<rear-1;i++)
			{
				que[i]=que[i+1];
			}
			rear--;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("que is empty");
		}
		else
		{
			for(int i=front;i<rear;i++)
			{
				System.out.println(que[i]);
			}
		}
	}

}
