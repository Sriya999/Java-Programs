
import java.util.*;
class Main {
    public static void main(String[] args) {
       
        int arr[]={5,9,1,8,7};
        int n=arr.length;
        int sl=3;
        int ans=0;
       for(int i=0;i<n-sl+1;i++){
           int j=i+sl-1;
           int temp=0;
           //System.out.println(i+" "+j);
           for(int k=i;k<=j;k++){
                 System.out.print(arr[k]+" ");
                 temp=temp+arr[k]; 
           }
           ans=Math.max(ans,temp);
           System.out.println();
       }
       System.out.println(ans);
    }
}
