class Solution {
    public int findMin(int[] num) {
        
//            int start=0;
//         int end=nums.length-1;
//         if(nums[start]<=nums[end])return end;
        
//         while(start<end){
//             int mid=start+(end-start)/2;
//             if(mid>0&&nums[mid]<nums[mid-1]){
//               //  System.out.println(start+" "+ end);
//                 return nums[mid];
//             }
//             //
            
//             if(nums[start]<=nums[mid]){
               
//                 start=mid+1;
                
//             }
//             else{
//                 end=mid;
                
//             }
//         }
//         return -1;
        
            int low = 0;
    int high = num.length - 1;
    while(low < high){
        int mid = (low + high) / 2;
        if(num[high] < num[mid]){
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return num[high];
        
        
        
    }
}