import java.util.*;
public class SecondLargest_element_in_Array_better {

    public static int  Findsecondlargest(int arr[],int n)
    {
    //better Approach--time complexity--O(2N)
    //find--largest
    int largest=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>largest) largest=arr[i];
    }
    //finding second largest
    int secondlargest=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest=arr[i];
        }
    }
    return secondlargest;
    }
    public static void main(String[] args)
    {
    int n;
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter size of Array:");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Elements for array:");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int secondlargest=Findsecondlargest(arr,n);
    if(secondlargest==Integer.MIN_VALUE)
    System.out.println("No Second Largest Element found.");
    else{
    System.out.println("Second Largest Element using Better Approach:"+secondlargest);

  }
}
}
