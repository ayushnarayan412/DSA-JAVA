package Graph;
import java.util.*;


public class AdjancyListImpl{
  static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  static void printGraph(ArrayList<ArrayList<Integer>> adj){
    for(int i=0;i<adj.size();i++){
      for(int j=0;j<adj.get(i).size();j++)
        System.out.print(adj.get(i).get(j)+" ");
      System.out.println();
    }
  }

  static void BFS(ArrayList<ArrayList<Integer>> adj,int V,int s){
    boolean visited[]=new boolean[V+1];
    Queue<Integer> q =new LinkedList<>();
    visited[s]=true;
    q.add(s);
    while(q.isEmpty()==false){
      int u=q.poll();
      System.out.print(u+" ");
      for(int v : adj.get(u)){
        if(visited[v]==false){
          visited[v]=true;
          q.add(v);
        }
      }
    }
  }

  public static void main(String[] args) {
    int v=5;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
    for(int i=0;i<v;i++)
      adj.add(new ArrayList<Integer>());
      addEdge(adj,0,1);
      addEdge(adj, 0, 2);
      addEdge(adj, 1, 2);
      addEdge(adj, 1, 3); 
      addEdge(adj, 2, 3);
      addEdge(adj, 2, 4);
      addEdge(adj, 3, 4);
      printGraph(adj); 
      BFS(adj,5,0);

  }
}