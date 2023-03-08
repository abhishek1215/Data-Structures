package com.customised.datastructures;

class Dnode{
	Dnode add1;
	int data;
	Dnode add2;
	public Dnode(int data)
	{
		this.data=data;
	}
}
public class DoublyLinkedList {
	Dnode root=null;
	public void insert(int data)
	{
		Dnode n1=new Dnode(data);
		
		if(root==null)
		{
			root=n1;
		}
		else
		{
			Dnode temp=root;
			while(temp.add2!=null)
			{
				temp=temp.add2;
			}
			temp.add2=n1;
			n1.add1=temp;
			
		}
	}
	public void display()
	{
		if(size()==0)
		{
			System.out.println("Empty");
		}
		else
		{
			Dnode temp=root;
			while(temp.add2!=null)
			{
				System.out.println(temp.data);
				temp=temp.add2;
			}
			System.out.println(temp.data);
		}
	}
	public int size()
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int count=1;
			Dnode temp=root;
			while(temp.add2!=null)
			{
				count++;
				temp=temp.add2;
			}
			return count;
			
		}
	}
	public void deleteFirstNode()
	{
		if(root==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			
			root=root.add2;
		}
	}
	public void delete()
	{
		if(size()==0)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			Dnode last=root;
			Dnode pre=null;
			while(last.add2!=null)
			{
				pre=last;
				last=last.add2;
				
			}
			pre.add2=null;
		}
	}
	public void delete(int index)
	{
		if(size()==0)
		{
			System.out.println("Linked is Empty");
		}
		else if(index>=size())
		{
			System.out.println("indexOutOfBound");
		}
		else if(index==0)
		{
			deleteFirstNode();
		}
		else if(index==size()-1)
		{
			delete();
		}
		else
		{
			Dnode target=root;
			Dnode pre=null;
			int count=0;
			while(index!=count)
			{
				count++;
				pre=target;
				target=target.add2;
			}
			pre.add2=target.add2;
			target.add1=pre;
			target.add1=null;
			target.add2=null;		
		}
	}
	public void insertAtFirst(int ele)
	{
		Dnode n1=new Dnode(ele);
		if(size()==0)
		{
			root=n1;
		}
		else
		{
			Dnode temp=root;
			root=n1;
			temp.add1=n1;
			n1.add2=temp;
		}
	}
	public void insertAtIndex(int index,int ele)
	{
		Dnode n1=new Dnode(ele);
		if(index==0)
		{
			insertAtFirst(ele);
		}
		else if(size()==0)
		{
			root=n1;
		}
		else if(index>size())
		{
			System.out.println("IndexOutOfBound");
		}
		else if(index==size())
		{
			insert(ele);
		}
		else
		{
			Dnode temp=root;
			int count=0;
			Dnode pre=null;
			while(index!=count)
			{
				count++;
				pre=temp;
				temp=temp.add2;
			}
			n1.add1=pre;
			n1.add2=temp;
			pre.add2=n1;
			temp.add1=n1;
			
		}
	}
	public void displayReverse()
	{
		if(size()==0)
		{
		    System.out.println("LinkedList is Empty");
		}
		else
		{
			Dnode temp=root;
			
			while(true)
			{
				if(temp.add2!=null)
				{
					temp=temp.add2;
				}
				else
				{
					
					break;
				}
			}
			System.out.println(temp.data);
			temp=temp.add1;
			while(temp.add1!=null)
			{
				System.out.println(temp.data);
				temp=temp.add1;
			}
			System.out.println(root.data);
			
			
			
		}
		
	}
}