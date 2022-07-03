class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        if(size==1)return nums[0];
        
        int arr[]=new int[size];
        arr[0]=nums[0];
        arr[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<size;i++){
            arr[i]=Math.max((nums[i]+arr[i-2]),arr[i-1]);
        }
        return Math.max(arr[size-1],arr[size-2]);
    }
}