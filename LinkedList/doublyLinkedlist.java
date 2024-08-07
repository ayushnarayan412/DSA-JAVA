package LinkedList;

class doublyNode{
  int data;
  doublyNode prev;
  doublyNode next;
  doublyNode(int x){
    data=x;
    prev=null;
    next=null;
  }
}

public class doublyLinkedlist {

  static void printlist(doublyNode head){
    doublyNode temp=head;
    while (temp!=null) {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    doublyNode head=new doublyNode(10);
    doublyNode temp1=new doublyNode(20);
    doublyNode temp2=new doublyNode(30);
    head.next=temp1;
    temp1.prev=head;
    temp1.next=temp2;
    temp2.prev=temp1;
    printlist(head);    
  }
  
}
