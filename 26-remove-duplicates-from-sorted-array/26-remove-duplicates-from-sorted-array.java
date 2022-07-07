class Solution {
    public int removeDuplicates(int[] nums) {
        
        //edge case end 
        
        if(nums.length==1)return 1;
        
        Stack<Integer> st=new Stack();
        
       
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]!=st.peek())st.push(nums[i]);
        }
        
        int ans=st.size();
        for(int i=st.size()-1;i>=0;i--){
            nums[i]=st.pop();
        }
        return ans;
          
        
    }
}