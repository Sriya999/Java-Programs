import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b){

        ArrayList<Integer>union=new ArrayList<>(); 
    
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;//2 pointers
        //traversing both arrays
        while(i<n1 && j<n2){
            //if a[i]<=a[j] then add a[i] to union
            if(a[i]<=b[j]){
                if(union.size()==0||union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                //if b[j]<a[i] then add b[j] to union
                if(union.size()==0||union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        //remaniing elements in larger array
        while(i<n1){
            if(union.get(union.size()-1)!=a[i]){
                union.add(a[i]);

            }
            i++;
        }
        while(j<n2){
            if(union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}