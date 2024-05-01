class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int minleft = height[left];
            int minright = height[right];
            int minheight = Math.min(minright,minleft);
            int area = minheight *(right-left);
            maxarea = Math.max(maxarea,area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxarea;
    }
}