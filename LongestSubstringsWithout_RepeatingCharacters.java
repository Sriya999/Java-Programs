class Solution {
    public int lengthOfLongestSubstring(String s) {
         int l=0,temp=0,ans=0;
        //traverse over string
        HashMap<Character,Integer>hm=new HashMap<>();

        for(int r=0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            while(hm.get(s.charAt(r))>1){
                 hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                if(hm.get(s.charAt(l))==0){
                    hm.remove(hm.get(l));
                }
                l++;
            }
            //produces only substrings without duplicates
            ans=Math.max(ans,r-l+1);
           
        }
        return ans; 
    }
}
