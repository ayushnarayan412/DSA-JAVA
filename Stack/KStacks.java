package Stack;

public class KStacks {
  int arr[],top[],next[];
  int freeTop=0;
  int k,cap;
  public KStacks(int k, int n) {
    this.k = k;
    cap=n;
    arr=new int[n];
    top=new int[k];
    next=new int[n];
    for(int i=0;i<k;i++)
    top[i]=-1;
    for(int i=0;i<n-1;i++)
    next[i]=i+1;
    next[n-1]=-1;
  }

  void push(int sn,int x){
    int i=freeTop;
    freeTop=next[i];
    next[i]=top[sn];
    top[sn]=i;
    arr[i]=x;
  }
  int pop(int sn){
    int i=top[sn];
    top[sn]=next[i];
    next[i]=freeTop;
    freeTop=i;
    return arr[i];
  }
  boolean isEmpty(int sn){
    return top[sn]==-1;
  }

  

}
