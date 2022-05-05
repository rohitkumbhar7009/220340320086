class LinkedList{

  static Node head;
  
  
  static class Node{
    int data;
	Node next;
	
	
	Node(int d)
	{
	  data = d;
	  next = null;
	
	}
  
  }
  Node reverse(Node node){
    Node prev = null;
	Node current = node;
	Node next = null;
	
	while(current !=null){
	 next=current.next;
	 current.next=prev;
	 prev=current;
	 current=next;
	}
  
     node=prev;
	 return node;
  
  }
  void printList(Node node){
  
  while(node!=null){
  
  System.out.println(node.data + "  ");
  node=node.next;
  }
  
  }
  public static void main (String args[]){
  
  LinkedList list=new LinkedList();
  list.head=new Node(2);
  list.head.next=new Node(4);
  list.head.next.next=new Node(3);
  list.head.next.next.next=new Node(4);
  list.head.next.next.next.next=new Node(2);
  list.head.next.next.next.next.next=new Node(5);
  
  
  
  System.out.println("Given LinkedList");
  list.printList(head);
  head=list.reverse(head);
  System.out.println(" ");
  System.out.println("reversed Linkedlist");
  list.printList(head);
  
  
  
  
  }




}