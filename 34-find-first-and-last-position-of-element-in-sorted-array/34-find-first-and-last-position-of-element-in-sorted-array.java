class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int last=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(nums[mid]>target)end=mid-1;
            if(nums[mid]<target)start=mid+1;
            if(nums[mid]==target){
                last=mid;
                start=mid+1;
            }
            
        }
          start=0;
         end=nums.length-1;
        int first=-1;
          while(start<=end){
            int mid=start+(end-start)/2;
            
            if(nums[mid]>target)end=mid-1;
            if(nums[mid]<target)start=mid+1;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            
        }
        int arr[]=new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}