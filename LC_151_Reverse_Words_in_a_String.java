class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String reverse = "";
        String r[] = s.split("\\s+");
        for (int i = r.length - 1; i >= 0; i--) {

            reverse = reverse + r[i] + " ";
        }
        reverse = reverse.trim();
        return reverse;
    }
}