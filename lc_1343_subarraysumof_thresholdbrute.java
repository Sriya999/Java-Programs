class Solution {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int l = 0;
        int avg = 0;
        for (int r = 0; r < arr.length - k + 1; r++) {
            l = r + k - 1;
            int sum = 0;
            for (int i = r; i <= l; i++) {
                sum = sum + arr[i];
            }
            avg = sum / k;

            if (avg >= threshold) {
                count++;
            }
        }
        return count;
    }
}
