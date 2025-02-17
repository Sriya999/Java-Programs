class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int temp = 97;// 'a' ascii value
        // mapping key
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, (char) temp);
                temp++;
            }
        }
        // result
        String res = "";
        // finding msg chars in hashmap
        for (int j = 0; j < message.length(); j++) {
            char ch = message.charAt(j);
            if (ch != ' ') {
                res = res + map.get(ch);

            } else {
                res = res + ' ';
            }
        }
        return res;
    }
}
