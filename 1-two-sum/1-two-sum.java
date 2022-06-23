class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++ ){
            if(hm.containsKey(target-nums[i])&&i!=hm.get(target-nums[i])){
                ans[0]=i;
                ans[1]=hm.get(target-nums[i]);
                return ans;
            }
        }
        return ans;
        
    }
}