
class Main {
    public static void main(String[] args) {
       
        int arr[]={2,3,4,5,6};
        int n=arr.length;
       
      //sliding window
       int l=0;
       int ans=0;
       int temp=0;
       for(int r=0;r<n;r++){
           temp=temp+arr[r];
           if(r-l==3){
               temp=temp-arr[l];
               l++;
           }
           if(r-l==2){
               ans=Math.max(ans,temp);
           }
       }
       System.out.println(ans);
    }
}
