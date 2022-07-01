class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans=-1;
        int right=0;
        for(int i=0;i<nums.length;i++){
            if(sum-right-nums[i]==right)return i;
            right+=nums[i];
        }
        return ans;
        
        
    }
}