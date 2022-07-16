class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0,end=nums.length-1;
        
    int sum=0;
        //int start=0,end=nums.length-1;
        
        while(start<=end){
          //  int mid=start+(end-start)/2;
            
            sum=nums[start]+nums[end];
            if(sum==target){
                int arr[]={++start,++end};
                return arr;
            }
           else if(sum>target)end--;
            else start++;
        }

        return null;
    }
}