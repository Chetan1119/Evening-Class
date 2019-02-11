import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node(int a)
	{
		data=a;
	}
}
public class Link{
	Node head;
	void add_node(int x)
	{
		Node temp=new Node(x);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node temp1=head;
			while(temp1.next!=null)
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
		}
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
		System.out.println(temp.data);
		temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		Link obj=new Link();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of nodes");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the data");
			int p=s.nextInt();
			obj.add_node(p);
			obj.display();
		}
	}
}
