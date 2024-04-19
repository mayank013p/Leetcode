class Solution {
    public int romanToInt(String s) {
        int no;
        int ans = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='I'){
                no = 1;
            }else if(s.charAt(i)=='V'){
                no = 5;
            }else if(s.charAt(i)=='X'){
                no = 10;
            }else if(s.charAt(i)=='L'){
                no = 50;
            }else if(s.charAt(i)=='C'){
                no = 100;
            }else if(s.charAt(i)=='D'){
                no = 500;
            }else if(s.charAt(i)=='M'){
                no = 1000;
            }else{
                return ans;
            }

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = 0;
                if (nextChar == 'I') {
                    nextValue = 1;
                } else if (nextChar == 'V') {
                    nextValue = 5;
                } else if (nextChar == 'X') {
                    nextValue = 10;
                } else if (nextChar == 'L') {
                    nextValue = 50;
                } else if (nextChar == 'C') {
                    nextValue = 100;
                } else if (nextChar == 'D') {
                    nextValue = 500;
                } else if (nextChar == 'M') {
                    nextValue = 1000;
                }
                if (no < nextValue) {
                    ans -= no;
                } else {
                    ans += no;
                }
            } else {
                ans += no;
            }
        }
        
        return ans;
    }
}