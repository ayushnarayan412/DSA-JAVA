package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
  int key;
  Node left;
  Node right;
  Node(int k){
    key=k;
    left=right=null;
  }
}
public class binaryTree {

  public void inOrder(Node root){
    if(root!=null){
      inOrder(root.left);
      System.out.print(root.key+" ");
      inOrder(root.right);
    }
  }

  public void preOrder(Node root){
    if(root!=null){
      System.out.print(root.key+" ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  public void postOrder(Node root){
    if(root!=null){
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.key+" " );
    }
  }

  public int height(Node root){
    if(root==null)
    return 0;
    else
    return Math.max(height(root.left),height(root.right))+1;
  }

  public static void printDist(Node root,int k){
    if(root==null) return;
    if(k==0) System.out.println(root.key+" ");
    else{
      printDist(root.left, k-1);
      printDist(root.right, k-1);
    }
  }
  //Level order traversal
  public static void levelOrderTraversal(Node root){
    if(root==null) return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(q.isEmpty()==false){
      Node curr=q.poll();
      System.out.print(curr.key+" ");
      if(curr.left!=null)
      q.add(curr.left);
      if(curr.right!=null)
      q.add(curr.right);
    }
  }
  //Level order traversal Line by line
  static void levelMethod1(Node root){
    if(root==null) return;
    Queue<Node> q=new LinkedList<Node>();
    q.add(root);
    q.add(null);
    while(q.size()>1){
      Node curr=q.poll();
      if(curr==null){
        System.out.println();
        q.add(null);
        continue;
      }
      System.out.print(curr.key+" ");
      if(curr.left!=null) q.add(curr.left);
      if(curr.right!=null) q.add(curr.right);
    }
  }
  static void levelMethod2(Node root){
    if(root==null) return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (q.isEmpty()==false) {
      int count=q.size();
      for(int i=0;i<count;i++){
        Node curr=q.poll();
        System.out.print(curr.key+" ");
        if(curr.left!=null) q.add(curr.left);
        if(curr.right!=null) q.add(curr.right);
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    binaryTree t=new binaryTree();
    Node root = new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.right.left=new Node(40);
    root.right.right=new Node(50);
    t.inOrder(root);
    System.out.println();
    t.preOrder(root);
    System.out.println();
    t.postOrder(root);
    System.out.println();
    System.out.println(t.height(root));
    levelMethod1(root);
  }

}
