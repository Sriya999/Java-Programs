

import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       String s="sriya";
       ArrayList<String>arr=new ArrayList<>();
       int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                     //System.out.println(arr[i]+" "+arr[j]);
                     String temp=s.substring(i,j+1);
                     arr.add(temp);
                     //System.out.println();
            }
        }
         System.out.println(arr);
    }
}
