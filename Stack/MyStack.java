package Stack;

public class MyStack {
  int arr[];
  int cap;
  int top;
  MyStack(int c){
    top=-1;
    cap=c;
    arr = new int[cap];
  }
  void push(int x){
    if(top==cap-1){
      System.out.println("Overflow");
      return;
    }
    top++;
    arr[top]=x;
  }
  int pop(){
    if(top==-1){
      System.out.println("Underflow");
      return -1;
    }
    int res=arr[top];
    top--;
    return res;
  }
  int size(){
    return top+1;
  }
  boolean isEmpty(){
    return (top==-1);
  }
}

class Test{
  public static void main(String[] args) {
    MyStack s = new MyStack(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());
    s.push(52);
  }
}
