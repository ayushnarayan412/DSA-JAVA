package LinkedList;

public class doublyLLInsertionandDeletion {
  static doublyNode insertBegin(doublyNode head,int x){
    doublyNode newNode = new doublyNode(x);
    newNode.next=head;
    if(head!=null)
    head.prev=newNode;
    return newNode;
  }

  static doublyNode insertEnd(doublyNode head,int x){
    doublyNode newNode=new doublyNode(x);
    if(head==null)
    return newNode;
    doublyNode temp=head;
    while(temp.next!=null)
    temp=temp.next;
    temp.next=newNode;
    newNode.prev=temp;
    return head;
  }

  static doublyNode reverseLL(doublyNode head){
     if(head==null || head.next ==null) return head;
     doublyNode prev=null,curr=head;
     while(curr!=null){
      prev =curr.prev;
      curr.prev=curr.next;
      curr.next=prev;
      curr=curr.prev;
     }
    return prev.prev;
  }

  static doublyNode deleteHead(doublyNode head){
    if(head==null) return null;
    if(head.next==null) return null;
    else{
      head=head.next;
      head.prev=null;
      return head;
    }
  }

  static doublyNode deleteLast(doublyNode head){
    if(head==null || head.next ==null) return null;
    doublyNode curr = head;
    while(curr.next!=null){
      curr=curr.next;
    }
    curr.prev.next=null;
    return head;
  }
  public static void main(String[] args) {
    doublyNode head=null;
    head=insertBegin(head, 5);
    head=insertBegin(head, 15);
    head=insertBegin(head, 45);
    head=insertEnd(head, 10);
    head=deleteHead(head);
    head=deleteLast(head);
    doublyLinkedlist.printlist(head);

  }
  
}
