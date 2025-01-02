import java.util.*;
public class majority_element_array_better {
        public static int majorityelement(int arr[]){
            HashMap<Integer,Integer>map=new HashMap<>();
            //better approach---time complexity-O(N)

            //traverse array

            for(int i=0;i<arr.length;i++){
                int key=arr[i];
                map.put(key,map.getOrDefault(key,0)+1);
            }
            int ans=-1;

            //traverse hashmap
            for(int i:map.keySet()){
                int value=map.get(i);//values
                if(value>arr.length/2){
                    ans=i;
                    break;
                }
            }
            return ans;


        }
         public static void main(String args[]){
        
            int arr[]={2,1,1,1,1,2,2};//array initialization
            int res=majorityelement(arr);
            System.out.println("Majority element using BruteForce:"+res);
        }
    
}
