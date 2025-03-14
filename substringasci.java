
import java.util.*;
class Main {
    public static void main(String[] args) {
       String s="sriya";
       int n=s.length();
       int sl=3;//subarraylength
       int ans=0;//maxsum
       for(int i=0;i<n-sl+1;i++){
           int j=i+sl-1;
           int temp=0;
           for(int k=i;k<j+1;k++){
               
               int val=s.charAt(k);
               //System.out.print(val+" ");
               temp=temp+val;
              // System.out.print(k+" ");
           }
           ans=Math.max(temp,ans);
           System.out.println();
       }
       System.out.println(ans);
    }
}
