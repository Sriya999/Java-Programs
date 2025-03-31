
import java.util.*;
class Main {
    public static void main(String[] args) {
 
        int arr[]={3,4,7,2};
        int k=1; //count of odd digits in subarray
        int l=0,temp=0,ans=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2!=0){
                temp++;
            } 
            while(temp>k){
                if(arr[l]%2!=0){
                    temp--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
        
    }
}
