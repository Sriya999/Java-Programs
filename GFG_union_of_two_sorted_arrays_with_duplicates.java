
import java.util.*;
class Main {
    public static void main(String[] args) {
      
        SortedSet<Integer>s=new TreeSet<>();
       
        int arr1[]={-7,8};
        int arr2[]={-8,-9,8,0};
        for(int i:arr1){
            s.add(i);
        }
   
         for(int j:arr2){
            s.add(j);
        }
    
          System.out.println(s);
        
        
        
    }
}
