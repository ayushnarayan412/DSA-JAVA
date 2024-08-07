package Searching;

public class RepeatingElements {

  public static int repeating(int arr[]){
    int n=arr.length;
    boolean visit[]=new boolean[n];
    for(int i=0;i<n;i++){
      if(visit[arr[i]]){
        return arr[i];
      }
      visit[arr[i]]=true;
    }
    return -1;
  }

  public static int findrepeating(int arr[]){
    int slow=arr[0]+1,fast=arr[0]+1;
    do{
      slow=arr[slow]+1;
      fast=arr[arr[fast]+1]+1;
    }while(slow!=fast);
    slow=arr[0]+1;
    while(slow!=fast){
      slow=arr[slow]+1;
      fast=arr[fast]+1;
    }
    return slow-1;
}

  public static void main(String[] args) {
    int arr[]={2,1,3,2,2};
    System.out.println(repeating(arr));
    System.out.println(findrepeating(arr));
  }


  
}
