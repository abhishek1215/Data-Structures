package com.customised.datastructures;
class Node1
{
	Node1 left=null;
	int data;
	Node1 right=null;
	public Node1(int data)
	{
		this.data=data;
	}
}
public class TreeSet {
	Node1 root=null;
	public void insert(int ele)
	{
		Node1 n=new Node1(ele);
		if(root==null)
		{
			root=n;
		}
		else
		{
			Node1 parent=root;
			Node1 temp=root;
			while(temp!=null)
			{
				if(temp.data==n.data)
				{
					System.out.println("Duplicate Found!");
					return ;
				}
				else if(temp.data>n.data)
				{
					parent=temp;
					temp=temp.left;
				}
				else
				{
					parent=temp;
					temp=temp.right;
				}
			}
			if(parent.data>n.data)
			    parent.left=n;
			else
				parent.right=n;
		}
	}

}
