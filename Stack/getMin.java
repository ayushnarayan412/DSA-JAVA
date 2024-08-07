package Stack;

import java.util.Stack;

public class getMin {

  Stack<Integer> s;
  int min;
  getMin(){
    s=new Stack<>();
  }
  void push(int x){
    if(s.isEmpty()){
    min=x;
    s.push(x);
    }
    else if(x<=min){
      s.add(x-min);
      min=x;
    } else{
      s.add(x);
    }
  }
  int pop() {

    int t=s.peek();s.pop();
    if(t<=0){
        int res=min;
        min=min-t;
        return res;
    }else{
        return t;
    }
   }

int peek() {
    int t=s.peek();
    return ((t<=0)? min : t);
   }
 
int getmin() {
      return min;
   }
   public static void main(String[] args) 
    { 
        getMin s=new getMin();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
        System.out.print("Minimum Element from Stack: " + s.getmin() );
    }  
}