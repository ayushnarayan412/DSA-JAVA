package LinkedList;

class cNode{
  int data;
  cNode next;
  public cNode(int data) {
    this.data = data;
    next=null;
  }
  
}

public class circularLinledList {

  static void printlist(cNode head){
    if(head==null) return;
    cNode temp=head;
    do{
      System.out.print(temp.data+" ");
      temp=temp.next;
    } while(temp!=head);
  }
  public static void main(String[] args) {
    cNode head = new cNode(10);
    cNode temp1 = new cNode(15); 
    cNode temp2 = new cNode(20);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = head;
    printlist(head);
  }

}
