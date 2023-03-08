package com.customised.datastructures;

import customexception.LinkedListEmptyException;

class Node
{
	int data;
	Node address;
	public Node(int data)
	{
		this.data=data;
	}
}
public class SingleLinkedList {
	 Node root;
	public void insert(int element)
	{
		Node n1=new Node(element);
		if(root==null)
		{
			root=n1;
		}
		
		else
		{
			Node last=root;
			while(last.address!=null)
			{
				last=last.address;
			}
			last.address=n1;
		}
	}
	public int delete()
	{
		int ele;
		if(root==null)
		{
			ele=-1;
		
		}
		else if(root.address==null)
		{
			ele= root.data;
			root=null;
		}
		else
		{
			Node last=root;
			while(last.address.address!=null)
			{
				last=last.address;
			}
			ele=last.address.data;
			last.address=null;
			
		}
		return ele;
		
	}
	public void display()
	{
		if(root==null)
		{
			System.out.println("Linkedlist is Empty");
		}
		else
		{
			Node temp=root;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.address;
			}
		}
			
	}
	public int size()
	{
		int count=0;
		if(root==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			Node temp=root;
			while(temp!=null)
			{
				count++;
				temp=temp.address;
			}
		}
		return count;
	}
	public void deleteFirst()
	{
		if(root==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else if(root.address==null)
		{
			root=null;
		}
		else
		{
			Node temp=root;
			root=root.address;
			temp=null;
		}
	}
	
	public void remove(int index)
	{
		if(root==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else if(index==0)
		{
			deleteFirst();
		}
		else if(index==size()-1)
		{
			delete();
		}
		else if(index>=size())
		{
			System.out.println("Invalid index");
		}
				
		else
		{
			int count=0;
			Node current=root;
			Node previous=null;
			while(count!=index)
			{
				count++;
				previous=current;
				if(current.address!=null)
				{
				current=current.address;
				}
				else
				{
					System.out.println("IndexOutOfBoundException");
					System.exit(0);
				}
			
			}
			previous.address=current.address;
			current=null;
		}
	}
	
	public void addTo1stNode(int element)
	{
		if(root ==null)
		{
			Node n1=new Node(element);
		}
		else
		{
			Node n1=new Node(element);
			n1.address=root;
			root=n1;
		}
	}
	
	public int retrive(int index)
	{
		if(root==null)
		{
			return -1;
		}
		else if(index==0)
		{
			return root.data;
		}
		else if(index>=size())
		{
			return -2;
		}
		else
		{
			int count=0;
			Node current=root;
			while(count<index)
			{
				count++;
				
				current=current.address;
			}
			
			return current.data;
			
		}
	}

}
