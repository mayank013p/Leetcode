class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k==0){
            return;
        }
        int[] arr = new int[n];

        System.arraycopy(nums,n-k,arr,0,k);
        System.arraycopy(nums,0,arr,k,n-k);
        System.arraycopy(arr,0,nums,0,n);
        }
    }
