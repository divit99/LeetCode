class Solution {
    public int maxProfit(int[] arr) {
        int sum=0;
        int start=0;
        int end=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                sum+=arr[end]-arr[start];
                start=i;
                end=i;
            }
            else end=i;
        }
        sum+=arr[end]-arr[start];
        return sum;
        
    }
}