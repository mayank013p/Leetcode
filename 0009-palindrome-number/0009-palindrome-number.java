class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
         if(x < 0){
            return false;
         }
         int rs = 0;
         while(num > 0){
            rs = (rs * 10 )+( num % 10);
            num = num / 10;
         }

         return x == rs;
         
    }
}