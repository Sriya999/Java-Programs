class Solution {
    public int countGoodSubstrings(String s) {

        ArrayList<String> arr = new ArrayList<>();
        int k = 3;
        int count = 0;
        // Store all substrings of length 3 in array
        for (int i = 0; i <= s.length() - k; i++) {
            arr.add(s.substring(i, i + k));
        }
        // Check for unique characters in each substring
        for (String ele : arr) {
            HashSet<Character> set = new HashSet<>();

            for (char ch : ele.toCharArray()) {
                set.add(ch);
            }
            if (set.size() == 3) {
                count++;
            }
        }

        return count;

    }
}
