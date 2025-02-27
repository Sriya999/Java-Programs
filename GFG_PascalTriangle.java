class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
   
    ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
   
     ArrayList<Integer>firstRow=new ArrayList<>();
     firstRow.add(1);
     arr.add(firstRow);
     
     //remaning elements
     for(int i=1;i<n;i++){
         ArrayList<Integer>temp=new ArrayList<>();
         temp.add(1);
         for(int j=1;j<i;j++){
            int ele=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
            temp.add(ele);
            
         }
         
         temp.add(1);
         arr.add(temp);
     }
    
        
     return arr.get(n-1);   
    }
}
