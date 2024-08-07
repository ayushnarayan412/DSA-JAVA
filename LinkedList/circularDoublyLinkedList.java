package LinkedList;

class cirDNode{
  int data;
  cirDNode next;
  cirDNode prev;
  cirDNode(int x){
    data=x;
    next=null;
    prev=null;
  }
}

public class circularDoublyLinkedList {
  static cirDNode insertBegin(cirDNode head,int x){
    cirDNode temp=new cirDNode(x);
    if(head==null){
      temp.next=temp;
      temp.prev=temp;
      return temp;
    }
    temp.prev=head.prev;
    temp.next=head;
    head.prev.next=temp;
    head.prev=temp;
    return temp;
  }

  static void printlist(cirDNode head){
    cirDNode curr=head;
    do{
      System.out.print(curr.data+" ");
      curr=curr.next;
    }while(curr!=head);
  }


  public static void main(String[] args) {
    cirDNode head=null;
    head=insertBegin(head, 12);
    head=insertBegin(head, 15);
    head=insertBegin(head, 16);
    printlist(head);
  }
}
