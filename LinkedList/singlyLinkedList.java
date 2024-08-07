package LinkedList;

class Node {
  int data;
  Node next,random;
  Node(int x){
    data=x;
    next=random=null;
  }
}
public class singlyLinkedList {

  public static void printlist(Node head){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println();
  }
  public static void recursivetraversal(Node head){
    if(head==null)
    return;
    System.out.print(head.data +" ");
    recursivetraversal(head.next);
  }
  public static void main(String[] args) {
    Node head =new Node(10);
    Node temp1=new Node(20);
    Node temp2=new Node(30);
    head.next=temp1;
    temp1.next=temp2;
    printlist(head);
    recursivetraversal(head);
  }
}