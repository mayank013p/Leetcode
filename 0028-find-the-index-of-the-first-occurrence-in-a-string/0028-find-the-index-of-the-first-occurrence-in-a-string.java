class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if(j == needle.length() - 1) {
                    return i; // Match found, return the starting index
                }
            }
        }
        return -1; // No match found
    }
}
