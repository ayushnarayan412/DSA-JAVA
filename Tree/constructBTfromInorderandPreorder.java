package Tree;

public class constructBTfromInorderandPreorder {

  int preIndex=0;
  Node cTree(int in[],int pre[],int is,int ie){
    if(is>ie) return null;
    Node root=new Node(pre[preIndex++]);

    int inIndex=is;
    for(int i=is;i<=ie;i++){
      if(in[i]==root.key){
        inIndex=i;
        break;
      }
    }
    root.left=cTree(in,pre,is,inIndex-1);
    root.right=cTree(in,pre,inIndex+1,ie);
    return root;
  }
  public static void inOrder(Node root){
    if(root!=null){
      inOrder(root.left);
      System.out.print(root.key+" ");
      inOrder(root.right);
    }
  }
  public static void main(String[] args) {
    int in[]={20,10,40,30,50};
    int pre[]={10,20,30,40,50};
    int ie=in.length-1;
    constructBTfromInorderandPreorder r=new constructBTfromInorderandPreorder();
    Node root1=r.cTree(in, pre, 0, ie);
    inOrder(root1);
  }
}