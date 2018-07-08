import java.io.*;
import java.util.*;
//import Node.java;

class LinkedList
{

    Node start = null;

    public void insert(int data)
    {
		Node current = new Node();
		current.data  = data;
		current.next =start;
		start = current;
    }


	public void display()
	{
		Node current = new Node();
		current =start;


		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}

	}


	 public void delete(int x)
	{
	   if(start == null)
	    return;

       Node prev;
	   Node current;
	   current = start;
	   prev = start;

	   while(current.next != null  && current.data != x)
	   {
	   prev = current;
	   current =current.next;
	   };
	   if(current == prev)
	   {
		   start = current.next;
	   }
	   if(current.data == x)
	   {
	     prev.next = current.next;
	   }


	 }


	 public void insertend(int x)
	 {
		 Node current;
		 Node prev;
		 current = start;
		 while(current != null)
		 {
			prev =current;
			current = current.next;
		 }
		 Node Temp = new Node();
		 Temp.data = x;
		 //prev.next =Temp;
		 Temp.next = current;
	 }

	 public int FindMid(Node current,int i)
	 {
		if(i==0)
		{
			current = start;
		}

		if(current == null)
		{
		  System.out.println("data of i value is "+ i);
		  return i/2;
		}

		 i=i+1;
		 int t = FindMid(current.next,i);
		 System.out.println("data of T value is "+ t);

		 if(t == 0)
		 {

		   System.out.println("data of mid is "+ current.data);
		   return  -1;

		 }
		 t=t-1;
		 return t;
     }

 }
