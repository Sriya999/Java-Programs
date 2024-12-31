import java.util.*;
public class Main {

    public static void secondlargest(int arr[],int n){
        int maxi=arr[0];
        
        Arrays.sort(arr);
        maxi=arr[n-1];
        int slargest=Integer.MIN_VALUE;
        //second largest bruteforce
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]!=maxi){
                slargest=arr[i];
                break;
            }
        }

        System.out.println("Second largest element in Array:"+slargest);

    }
   public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        secondlargest(arr,n);
        sc.close();

}
}
