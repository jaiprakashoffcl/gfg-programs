// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder temp = new StringBuilder(s);
        
        temp.reverse();
        
        String reverseString = temp.toString();
        return reverseString;
    }
}