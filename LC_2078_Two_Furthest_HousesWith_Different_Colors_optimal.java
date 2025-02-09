class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxdist = 0;
       //case 1:comparing last element with starting elements which is diffrent from last element
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                int dist = Math.abs(i - (n - 1));

                maxdist = Math.max(maxdist, dist);
                break;

            }

        }
        //case2:checking from last of array if there is elemt=ent other than first element
        for (int i = n - 1; i >= 0; i--) {
            if (colors[0] != colors[i]) {
                int dist = Math.abs(i);
                maxdist = Math.max(dist, maxdist);
                break;

            }
        }
        return maxdist;
    }
}
