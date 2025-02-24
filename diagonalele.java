

class Main {
    public static void main(String[] args) {
  
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=mat.length;
        int c=mat[0].length;
        int i=r-1;
        int j=c-1;
        while(i>=0&&j>=0){
            System.out.println(mat[i][j]);
            i--;
            j--;
        }
    }
}
