class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        
        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                result = 'Z' + result;
                columnNumber = (columnNumber / 26) - 1;
            } else {
                result = (char) ((remainder - 1) + 'A') + result;
                columnNumber = columnNumber / 26;
            }
        }
        return result;
    }
}