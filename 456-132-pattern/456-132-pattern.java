class Solution {
    public boolean find132pattern(int[] nums) {
        
        // Step 1 : Make Minimum Array
        int[] minimum = new int[nums.length];
        minimum[0] = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++ )
        {
            minimum[i] = Math.min(nums[i],minimum[i - 1]);
        }
        
        // This minimum array will give us 1 i.e. 1 from 132 Pattern
        
        //Step 2 : Make Stack that will give us 2 i.e. 2 from 132 Pattern
        
        Stack<Integer> st = new Stack<>();
        
        for(int j = nums.length-1 ; j>=0 ; j--)
        {
            while(st.size() > 0 && st.peek() <= minimum[j])
            {
                // If this condition holds true that means our minimum is greater 
                // We are not able to find Medium.That is why we pop.
                // Whenever we got element greater than minimum[j] that means we got medium. 
                st.pop();
                
            }
            
            //Now we have our medium we have to check is there any element which is greater than medium or not
            if(st.size() > 0 && st.peek()<nums[j])
            {
                return true;
            }
            st.push(nums[j]);
        }
        return false;
    }
}