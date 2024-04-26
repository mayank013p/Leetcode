class Solution {
    public int scoreOfString(String s) {
        int solu = 0;
        
        for(int i = 0; i<s.length()-1; i++){
            int a = s.charAt(i);
            int b = s.charAt(i+1);
            solu += Math.abs(a-b);
        }
         return solu;
    }
   
}