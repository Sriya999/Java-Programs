import java.util.*;
public class majority_element_array_brute {

    public static void main(String args[]){
        
        int arr[]={2,2,3,3,1,2,2};//array initialization
        int res=Majorityelement(arr);
        System.out.println("Majority element using BruteForce:"+res);
    }
    public static int Majorityelement(int arr[]){
        int n=arr.length;
        int size=n/2;


        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count+=1;

                }
                if(count>size){
                return arr[i];
                }
            }
        }
        return -1;//if not found returns -1
    }
    
}
