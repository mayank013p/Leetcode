class Solution {
    public int trap(int[] height) {

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int j = height.length-2; j>=0;j--){
            rightMax[j] = Math.max(rightMax[j+1],height[j]);
        }

        int twater = 0;
        for(int k = 0 ; k<height.length;k++){
            int waterLevel = Math.min(leftMax[k],rightMax[k]);

            twater += waterLevel - height[k];
        }
        return twater;
    }
}