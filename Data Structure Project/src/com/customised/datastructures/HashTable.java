package com.customised.datastructures;

public class HashTable {
	int cap;
	int []hash;
	public HashTable(int cap)
	{
		this.cap=cap;
		hash=new int[cap];
		reset();
	}
	public HashTable()
	{
		this.cap=5;
		hash=new int[cap];
		reset();
	}

	public void insert(int ele)
	{
		int key =ele%cap;
		if(hash[key]==-1)
		{
			hash[key]=ele;
		}
		else
		{
			System.out.println("Duplicate key found");
		}
	}

	public void delete(int ele)
	{
		int key =ele%cap;
		if(hash[key]==ele)
		{
			hash[key]=-1;
		}
		else
		{
			System.out.println("Element not Found!");
		}
	}

	public int size()
	{
		int count=0;
		for(int i=0;i<cap;i++)
		{
			if(hash[i]!=-1)
			{
				count++;
			}
		}
		return count;
	}

	public void display()
	{
		if(size()==0)
		{
			System.out.println("HashSet is Empty");
		}
		else
		{
			for(int i:hash)
			{
				if(i!=-1)
				{
					System.out.println(i);
				}
			}
		}

	}
	
	public void reset()
	{
		for(int i=0;i<cap;i++)
		{
			hash[i]=-1;
	
		}
	}

}
