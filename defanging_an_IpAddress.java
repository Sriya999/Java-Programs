class Solution {
    public String defangIPaddr(String address) {
        //using replace function
        String result = "";
        address = address.replace(".", "[.]");
        return address;

    }
}
