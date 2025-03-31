import java.util.*;
class Main {
    public static void main(String[] args) {
       
        int arr[]={0,1,3,1,1,6,7,1,0,1};
        int k=2;
        int l=0,temp=0,ans=0;
        for(int r=0;r<arr.length;r++){
        
            if(arr[r]==1){
                temp++;
            }
        
            while(temp>2){
                if(arr[l]==1){
                temp=temp-1;
                }
                l++;
            }
           
            ans=Math.max(ans,r-l+1);
           
        }
        System.out.println(ans);
    }
}
