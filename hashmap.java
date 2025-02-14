
import java.util.*;
class Main {
    public static void main(String[] args) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int arr[]={1,1,2,7,4,9,3,7,9,5,6,4,1};
      for(int i=0;i<arr.length;i++){
          if(map.containsKey(arr[i])){
             int prev=map.get(arr[i]);
             map.put(arr[i],(prev+1));
          }
          else{
              map.put(arr[i],1);
          }
      }
    for(int key:map.keySet()){
      System.out.println(key+"->"+map.get(key));
    }
    }
}
