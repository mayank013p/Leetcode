class Solution {
    public String reverseWords(String s) {
        String bigstr[] = s.trim().split("\\s+");

        int left = 0;
        int right = bigstr.length-1;
        while(left<right){
            String temp = bigstr[left];
            bigstr[left] = bigstr[right];
            bigstr[right] = temp;
            left++;
            right--;
        }

        String result = "";
        for(String word : bigstr){
            result = result + word + " ";
        }
        return result.trim();
    }
}
