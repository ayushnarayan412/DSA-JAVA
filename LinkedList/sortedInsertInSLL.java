package LinkedList;

class sortedInsertInSLL {
  static Node sortedInsert(Node head,int x){
    Node temp=new Node(x);
    if(head==null){
      return temp;
    }
    if(x<head.data){
      temp.next=head;
      return temp;
    }
    Node curr=head;
    while(curr.next!=null && curr.next.data<x){
      curr=curr.next;}
      temp.next=curr.next;
      curr.next=temp;
      return head;
  }

  public static void main(String[] args) {
    Node head=null;
    head=sortedInsert(head, 15);
    head=sortedInsert(head, 10);
    head=sortedInsert(head, 25);
    head=sortedInsert(head, 20);
    head=sortedInsert(head, 5);
    singlyLinkedList.printlist(head);


  }
}
