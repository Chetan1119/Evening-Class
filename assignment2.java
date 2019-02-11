import java.util.*;
class Node {
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
  }
}
class Main{
Node head;
void add(int d)
{
  Node temp=new Node(d);
  if(head==null)
  {
    head=temp;
    head.next=head;
  }
  else
  {
    Node t=head;
    while(t.next!=head)
    {
      t=t.next;
    }
    t.next=temp;
    temp.next=head;
  }
}
  void display()
  {
    Node j=head;
    while(j.next!=head)
    {
      System.out.print(j.data);
      j=j.next;
      }
      System.out.print(j.data);
  }
     public static void main(String[] args){
    Main obj=new Main();
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of nodes");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
       System.out.print("enter the data parts for the nodes");
       int p=sc.nextInt();
       obj.add(p);
    }
    obj.display();
  }

}



