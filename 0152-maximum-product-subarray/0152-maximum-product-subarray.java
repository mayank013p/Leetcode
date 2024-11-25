class Solution {
    public int maxProduct(int[] arr) {
        int maxP = arr[0];
        int minP = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            if (num < 0){
                int temp = maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(num, maxP * num);
            minP = Math.min(num, minP * num);

            ans = Math.max(ans, maxP);
        }

        return ans;
    }
}