
import java.util.*;
class Main {
    public static void main(String[] args) {
    int arr[]={5,9,1,9,6,8,1,2,3,3};
    for(int i=0;i<arr.length;i++){
        boolean swapped=false;
        for(int j=0;j<arr.length-i-1;j++){
          
          if(arr[j]>arr[j+1])  {
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
             swapped=true;
              
          }
        }
        if(swapped==false){
            break;
        }
}
//print arr
for(int i:arr){
    System.out.println(i);
}


    }
}
