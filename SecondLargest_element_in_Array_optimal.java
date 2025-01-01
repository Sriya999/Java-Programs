import java.util.*;
class SecondLargest_element_in_Array_optimal{
    public  static void Findsecondlargest(int arr[],int n){
   
    int seclargest=Integer.MIN_VALUE;
    int largest=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>largest) largest=arr[i];
    }
    for(int i=0;i<n;i++){
        if(arr[i]>largest){
            seclargest=largest;
            largest=arr[i];
        }
        if(arr[i]!=largest && arr[i]>seclargest){
            seclargest=arr[i];
        }
    }
    System.out.println("Second Largest element from Array:"+seclargest);
    }

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter size of array:");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements of array:");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
Findsecondlargest(arr,n);
sc.close();

}

}