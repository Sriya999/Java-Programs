
import java.util.*;
class Main {
    public static void main(String[] args) {
       
        int arr[]={5,9,1,8,7};
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=0;
                for(int k=i;k<=j;k++)
                {
                        // System.out.print(arr[k]+" ");
                            temp=temp+arr[k];
                }
               ans=Math.max(ans,temp);
                System.out.println();
            }
        }
           System.out.println(ans);
    }
}
