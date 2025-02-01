class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
           
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>l=new ArrayList<>();
    
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:b){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet()){
            l.add(k);
        }
     Collections.sort(l);
        
          return l;
        
    }
}
