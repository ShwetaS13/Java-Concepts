/*
PROGRAM: Program to create a linked list from scratch with functions. (createList, deleteNode, insertNode)
		We assume that the linked list is a structure where the new node is inserted at the beginning of the list.
*/

import java.io.*;
class Node
{
	static int data;
	static Node next;
	static Node head, current, temp;
	
	//constructor for creating a new node.
	Node(int data)
	{
		this.data = data;
		next = null;
	}
	
	//function to create the linked list - adds elements at the beginning of the linked list.
	static void createList()throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the data: ");
		data = Integer.parseInt(br.readLine());
		
		temp = new Node(data);
		head = current = temp;
		//System.out.println("DATA-->"+data+" NEXT-->"+next+"	HEAD-->"+head+"	TEMP-->"+temp+" CURRENT-->"+current);
		System.out.print("Want to add another element?	1-YES	0-NO	");
		int element = Integer.parseInt(br.readLine());
		while(element == 1)
		{
			System.out.print("Enter the data: ");
			data = Integer.parseInt(br.readLine());
		
			temp = new Node(data);
			head = temp;
			head.next = current;
			current = head;
			//System.out.println("DATA-->"+data+"	NEXT-->"+next+"	HEAD-->"+head+"	TEMP-->"+temp+" CURRENT-->"+current);
			System.out.print("Want to add another element?	1-YES	0-NO	");
			element = Integer.parseInt(br.readLine());
		};
	}
	
	//function to insert a node into the LL after a specific node
	static void insertAfter()
	{
		
	}
	
	//function to insert a node in the LL before a specific node
	static void insertBefore()
	{
		
	}
	
	//function to insert a node in the LL at the beginning
	static void insertBeginning()
	{
		
	}
	
	//function to insert a node in the LL at the end
	static void insertAtEnd()
	{
		
	}
	
	//function to look for a node in the list with the desired data
	static void searchList()throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter search element: ");
		int element = Integer.parseInt(br.readLine());
		System.out.println("element--> "+element);
		
		do
		{
			if(current.data == element)
			{
				System.out.println("Element found!");
				break;
			}
			else
			{
				current = head.next;
				head = current;
			}
			System.out.println("Element not found!");
		}
		while(current != null);
		head = current = temp;
	}
	
	//function to delete the head
	static void deleteHead()
	{
		
	}
	
	//function to delete the last node i.e., the tail node
	static void deleteTail()
	{
		
	}
	
	//function to delete the node with the desired data
	static void deleteNode()
	{
		//call the function searchList() to see see if the node is present and then delete the node if present
	}
}

public class LinkedList
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int choice, cont;
		do
		{
			System.out.println("Choose action from the list below:");
			System.out.println("1. Create a LL");
			System.out.println("2. Insert after a node");
			System.out.println("3. Insert before a node");
			System.out.println("4. Insert at the beginning");
			System.out.println("5. Insert at the end");
			System.out.println("6. Search a node");
			System.out.println("7. Delete Head");
			System.out.println("8. Delete Tail");
			System.out.println("9. Delete an element");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: 	
							Node.createList();
							break;
							
				case 2:		Node.insertAfter();
							break;
							
				case 3:		Node.insertBefore();
							break;
							
				case 4: 
							break;
							
				case 5:	
							break;
							
				case 6:		Node.searchList();
							break;
							
				case 7: 
							break;
							
				case 8:	
							break;
							
				case 9:	
							break;
							
				default:	System.out.println("Please select a valid option.");
							break;
						
			}
			System.out.print("Do you wish to continue?	1-YES 0-NO	");
			cont = Integer.parseInt(br.readLine());
		}
		while(cont==1);
	}
}