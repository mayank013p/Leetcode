class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int t = citations.length-1;
        for(int j = 0;j<citations.length/2;j++){
            int temp = citations[t];
            citations[t] = citations[j];
            citations[j] = temp;
            t--;
        }
        int count = 0;
        for(int i = 0; i<citations.length;i++){
            if(citations[i] >= i+1){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}