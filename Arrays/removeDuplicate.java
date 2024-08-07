package Arrays;

public class removeDuplicate {

  public static int remDupfromSortedarray(int arr[]) {
    int res = 1;

    	for(int i = 1; i < arr.length; i++)
    	{
    		if(arr[res - 1] != arr[i])
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}

    	return res;
  }

  public static void main(String[] args) {
    int arr[]={1,1,2,2,2,3,4,5,5};
    int n=remDupfromSortedarray(arr);
    for (int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");
      
    }
  }
  
}
