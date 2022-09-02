class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int start = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                start = i;
                break;
            }
        }
        if(start==-1){
            reverse(nums,0,n-1);
            return;
        }
        int val = nums[start-1];
        int pos = binarySearch(nums,start,n-1,val+1);
        swap(nums,start-1,pos);
        reverse(nums,start,n-1);
    }
    private void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int[] nums,int i,int j){
        for(;i<j;i++,j--){
            swap(nums,i,j);
        }
    }
    private int binarySearch(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] < target){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return high;
    }
}