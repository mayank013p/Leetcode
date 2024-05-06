class Solution {
    public int smallestEvenMultiple(int n) {
        int a = Integer.MAX_VALUE;
        int i = n;
        while(a>=i){
            if(i%n==0 && i%2==0){
                return i;
            }
            i++;
        }
        return 0;
    }
}