class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>dq=new ArrayDeque<>();
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int j=0;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i])dq.removeLast();
            dq.addLast(i);
        }
        ans[j++]=nums[dq.peekFirst()];
        
        for(int i=k;i<n;i++){
            if(!dq.isEmpty()&&dq.peekFirst()==i-k)dq.removeFirst();
             while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i])dq.removeLast();
            dq.addLast(i);
            ans[j++]=nums[dq.peekFirst()];
        }
        return ans;
    }
}