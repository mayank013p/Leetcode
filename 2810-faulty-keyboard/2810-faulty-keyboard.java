class Solution {
    public String finalString(String s) {
        String ans = "";
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) != 'i'){
                ans += s.charAt(i);
            }else{
                int length = ans.length();
                String reversed = "";
                 for (int j = length - 1; j >= 0; j--) {
                     reversed += ans.charAt(j);
                  }
                  ans = reversed;
            }
        }
        return ans;
    }
}