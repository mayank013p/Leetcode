class Solution {
    public void nextPermutation(int[] arr) {
        int length = arr.length;
        int i =length-2;
        while(i>=0 && arr[i] >= arr[i+1] )i--;
        
        if(i>=0){
            int j = length-1;
            while(arr[j] <= arr[i]){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for (int start = i + 1,end = length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}