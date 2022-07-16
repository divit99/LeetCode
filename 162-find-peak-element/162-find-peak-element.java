class Solution {
    public int findPeakElement(int[] nums) {
        
        int start=0,end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println(mid+" "+start+" "+end);
            
            if(mid>0&&nums[mid]>nums[mid-1])start=mid+1;
            else if(mid==0)start++;
            else end=mid-1;
        }
        
        return end<0?0:end;
        
    }
}