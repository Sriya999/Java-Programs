
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,5,3,1,9};
        int maxweight=0;
        int l=0,temp=0;
     
        for(int r=0;r<arr.length;r++){
            temp=temp+arr[r];
            while(temp>10){
                temp=temp-arr[l];
                l++;
            }

             maxweight=Math.max(maxweight,r-l+1);
         
            
            }
           
        System.out.println(maxweight);
        
    }
}
