class Solution {
    public boolean isPalindrome(String s) {
        String qs = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.print(s.charAt(i));
        // }
        String last = "";
        for(int i = qs.length()-1 ; i>=0;i--){
            last = last + qs.charAt(i);
        }
        System.out.print(last);
        return last.equals(qs);
    }
}