package LinkedList;

import java.util.HashMap;

public class someLinkedListquestions {
  // remove duplicates from a sorted linked list 
  static void removeDup(Node head) {
    Node curr = head;
    while (curr != null && curr.next != null) {
      if (curr.data == curr.next.data) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }
    }
  }

  //reverse Linked List in groups
  static Node reverseGroups(Node head,int k){
     // recursive solution
    Node curr=head;
    Node prev=null,next=null;
    int count=0;
    while(curr!=null && count<k){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
      count++;
    }
    if(next!=null){
      Node restHead=reverseGroups(next, k);
      head.next=restHead;
    }
    return prev;
  }

  static Node reverseK(Node head,int k){
    //Iterative solution
    Node curr=head,prevFirst=null;
    boolean isFirstpass=true;
    while(curr!=null){
      Node first=curr,prev=null;
      int count=0;
      while(curr!=null&&count<k){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        count++;
      }
      if(isFirstpass){
        head=prev;
        isFirstpass=false;
      } else{
        prevFirst.next=prev;
      }
      prevFirst=first;
    }
    return head;
  }

  //Segregate Even and Odd Nodes
  static Node segregate(Node head){
    Node es=null,ee=null,os=null,oe=null;
    for(Node curr=head;curr!=null;curr=curr.next){
      int x=curr.data;
      if(x%2==0){
        if(es==null)
        es=ee=curr;
        else{
          ee.next=curr;
          ee=ee.next;
        }
      } else{
        if(os==null)
        os=oe=curr;
        else{
          oe.next=curr;
          oe=oe.next;
        }
      }
    }
    if(os==null || es==null)
    return head;
    ee.next=os;
    oe.next=null;
    return es;
  }

  //pairwise swap nodes of linked list
  static Node pairwiseswap(Node head){
    //naive approach
    Node curr=head;
    while(curr!=null && curr.next!=null){
      int temp=curr.data;
      curr.data=curr.next.data;
      curr.next.data=temp;
      curr=curr.next.next;
    }
    return head;
  }
  //changing links in pairwise swap
  static Node pairSwap(Node head){
    if(head==null || head.next==null){
      return head;
    }
    Node curr=head.next.next;
    Node prev=head;
    head=head.next;
    head.next=prev;
    while(curr!=null && curr.next!=null){
      prev.next=curr.next;
      prev=curr;
      Node next=curr.next.next;
      curr.next.next=curr;
      curr=next;
    }
    prev.next=curr;
    return head;
  }

  //Clone a linked list with Random Pointer
  static Node clone(Node h1) {
    HashMap<Node,Node>m=new HashMap<>();
    for(Node curr=h1;curr!=null;curr=curr.next){
      m.put(curr,new Node(curr.data));
    }
    for(Node curr=h1;curr!=null;curr=curr.next){
      Node clone=m.get(curr);
      clone.next=m.get(curr.next);
      clone.random=m.get(curr.random);
    }
    return m.get(h1);
  }

  static Node cloneLL(Node h1){
    Node curr=h1;
    while(curr!=null){
      Node next=curr.next;
      curr.next=new Node(curr.data);
      curr.next.next=next;
      curr=next;
    }
    for(curr=h1;curr!=null;curr=curr.next.next)
    curr.next.random=(curr.random==null)?null:curr.random.next;
    Node h2=h1.next;
    Node clone=h2;
    for(curr=h1;curr!=null;curr=curr.next) {
      curr.next=curr.next.next;
      clone.next= clone.next != null ?clone.next.next:null;
      clone =clone.next;
      }
    return h2;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = new Node(6);
    //removeDup(head);
    singlyLinkedList.printlist(head);
    head=reverseGroups(head, 3);
    //head=reverseK(head, 3);
    //head=segregate(head);
    // head=pairwiseswap(head);
    singlyLinkedList.printlist(head);
  }
}