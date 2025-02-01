class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
             HashSet<Integer>s=new HashSet<>();
        
        for(int j:b){
            s.add(j);
        }
        for(int i:a){
            s.add(i);
        }
       
        ArrayList<Integer>p=new ArrayList<>(s); 
         
        Collections.sort(p);
  
        return p;
  
    }
}