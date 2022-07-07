class Solution {
    public int removeDuplicates(int[] nums) {
        
        //edge case end 
        
        //0 0 1 1 1 2 2 3 3 4
        
        
        
        
        int start=1;
        int end=1;
        
        for( int i=end;end<nums.length;end++){
            if(nums[end]!=nums[end-1]){
                nums[start]=nums[end];
                start++;
            }
        }
        
        return start;
        
        
//         if(nums.length==1)return 1;
        
//         Stack<Integer> st=new Stack();
        
       
//         st.push(nums[0]);
//         for(int i=1;i<nums.length;i++){
            
//             if(nums[i]!=st.peek())st.push(nums[i]);
//         }
        
//         int ans=st.size();
//         for(int i=st.size()-1;i>=0;i--){
//             nums[i]=st.pop();
//         }
//         return ans;
          
        
    }
}