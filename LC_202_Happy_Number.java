class Solution {
    public boolean isHappy(int n) {
        // To avoid cycle Loop
        HashSet<Integer> visit = new HashSet<>();
        while (n != 1 && !visit.contains(n)) {
            visit.add(n);// adding sums to set
            int sum = 0;// storing result sum
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }
            n = sum;// updating the n
        }
            return n==1;
        }
    }
