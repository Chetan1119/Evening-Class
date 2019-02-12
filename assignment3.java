import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
		this.data=data;
	}
}
class Doubly{
	Node head;
	Node add(int d)
	{
		Node temp=new Node(d);
		if(head==null)
		{
			temp.prev=null;
			temp.next=head;
			head=temp;
		}
		else
		{
			Node t=head;
			t.prev=temp;
			temp.next=t;
			temp.prev=null;
			head=temp;
		}
		return head;
	}
	void display(Node head)
	{
		Node s=head;
		while(s!=null)
		{
			System.out.println(s.data);
			s=s.next;
		}
	}
	public static void main(String [] args)
	{
		Doubly obj=new Doubly();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Nodes");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value for the node");
			int p=s.nextInt();
			Node head=obj.add(p);
		}
		obj.display(obj.head);
	}
}
