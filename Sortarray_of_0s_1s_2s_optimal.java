import java.util.*;
public class Sortarray_of_0s_1s_2s_optimal {
    public static int[] sortarray(int arr[]){
        //Dutch Flag Algorithm -- time complexity---O(N)-single pass 
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        return arr;
       
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String args[]){
        int arr[]={0,1,2,0,1,2,1,2,0,0,0,0,1};
        
        System.out.println("the array given:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int res[]=sortarray(arr);
        System.out.println();
        System.out.println("Sorted Array:");
        for(int i:res){
            System.out.print(i+" ");
        }
       
    }
}
