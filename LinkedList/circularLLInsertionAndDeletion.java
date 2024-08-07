package LinkedList;

public class circularLLInsertionAndDeletion {

  static cNode insertBegin(cNode head, int x) {
    cNode newNode = new cNode(x);
    if (head == null) {
      newNode.next = newNode;
      return newNode;
    } else {
      newNode.next = head.next;
      head.next = newNode;
      int t = head.data;
      head.data = newNode.data;
      newNode.data = t;
      return head;
    }
  }

  static cNode insertEnd(cNode head,int x){
    cNode temp=new cNode(x);
    if(head==null){
      temp.next=temp;
      return temp;
    } else{
      temp.next=head.next;
      head.next=temp;
      int t=temp.data;
      temp.data=head.data;
      head.data=t;
      return temp;
    }

  }

  static cNode delHead(cNode head){
    if(head==null) return null;
    if(head.next==head) return null;
    head.data=head.next.data;
    head.next=head.next.next;
    return head;
  }

  static cNode deletePos(cNode head,int pos){
    if(head==null) return head;
    if(pos==1)
    return delHead(head);
    cNode curr=head;
    for(int i=0;i<pos-2;i++){
      curr=curr.next;
    }
    curr.next=curr.next.next;
    return head;
  }

  static void printlist(cNode head) {
    if (head == null)
      return;
    cNode temp = head;
    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != head);
  }

  public static void main(String[] args) {
    cNode head = null;
    head = insertBegin(head, 10);
    head = insertBegin(head, 15);
    head = insertBegin(head, 30);
    head=insertEnd(head, 25);
    head=deletePos(head, 2);
    printlist(head);
  }

}
