import java.util.*;
public class majority_element_array_optimal {
        public static int majorityelement(int arr[]){
            //moore voting algorithm
                    int freq=0,ans=0;
                    for(int i=0;i<arr.length;i++){
                        if(freq==0){
                            ans=arr[i];
                        }
                        if(ans==arr[i]){
                            freq++;//tc==o(N)
                        }
                        else{
                            freq--;
                        }
                    }
                    int count=0;
                    for(int i:arr){
                        if (ans==i){
                            count++;
                        }
                    }
                    if(count>arr.length/2){
                        return ans;
                    }
                    else{
                        return -1;
                    }
                }
        
         public static void main(String args[]){
        
            int arr[]={2,1,1,3,2,2,2};//array initialization
            int res=majorityelement(arr);
            System.out.println("Majority element using optimal:"+res);
            
        }
    

}
