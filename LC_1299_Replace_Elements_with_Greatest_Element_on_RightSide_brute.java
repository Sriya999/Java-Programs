class Solution {
    public int[] replaceElements(int[] arr) {
        int result[] = new int[arr.length];
        result[arr.length - 1] = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int res = findgreat(arr, i + 1);
            result[i] = res;
        }
        return result;
    }

    public static int findgreat(int arr[], int i) {

        int maxi = arr[i]; 

        for (int k = i + 1; k < arr.length; k++) { 
            if (maxi < arr[k]) {
                maxi = arr[k];
            }
        }

        return maxi;
    }
}
