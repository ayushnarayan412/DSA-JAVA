package LinkedList;

public class singlyLLInsertionAndDeletion {
  static Node insertBegin(Node head, int x) {
    Node temp = new Node(x);
    temp.next = head;
    return temp;
  }

  static Node insertEnd(Node head, int x) {
    Node temp = new Node(x);
    if (head == null)
      return temp;
    Node curr = head;
    while (curr.next != null)
      curr = curr.next;
    curr.next = temp;
    return head;
  }

  static Node insertPos(Node head, int pos, int x) {
    Node temp = new Node(x);
    if (pos == 1) {
      temp.next = head;
      return temp;
    }
    Node curr = head;
    for (int i = 1; i <= pos - 2 && curr != null; i++)
      curr = curr.next;
    if (curr == null)
      return head;
    temp.next = curr.next;
    curr.next = temp;
    return head;
  }

  static Node delHead(Node head) {
    if (head == null)
      return null;
    else
      return head.next;
  }

  static Node delTail(Node head) {
    if (head == null)
      return null;
    if (head.next == null)
      return null;
    Node curr = head;
    while (curr.next.next != null)
      curr = curr.next;
    curr.next = null;
    return head;
  }

  static int search(Node head, int x) {
    int pos = 1;
    Node curr = head;
    while (curr != null) {
      if (curr.data == x)
        return pos;
      else {
        pos++;
        curr = curr.next;
      }
    }
    return -1;
  }

  static int rSearch(Node head, int x) {
    if (head == null)
      return -1;
    if (head.data == x)
      return 1;
    else {
      int res = rSearch(head.next, x);
      if (res == -1)
        return -1;
      else
        return (res + 1);
    }
  }

  static Node reverseLL(Node head){
    Node curr=head;
    Node prev=null;
    while(curr!=null){
      Node temp=curr.next;
      curr.next=prev;
      prev=curr;
      curr=temp;
    }
    return prev;
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = null;
    head = insertBegin(head, 10);
    head = insertBegin(head, 20);
    head = insertBegin(head, 30);
    head = insertEnd(head, 40);
    head = insertPos(head, 4, 45);
    // head = delHead(head);
    // head = delTail(head);
    System.out.print("Linked List: ");
    printList(head);
    // System.out.println(search(head, 45));
    // System.out.println(search(head, 30));
    // System.out.println(rSearch(head, 45));
    head=reverseLL(head);
    printList(head);
  }
}