class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        List<Integer>temp=new ArrayList();
        ans(0,nums,temp,res);
        return res;
        
    }
    void ans(int index,int [] nums, List<Integer>temp,List<List<Integer>> res ){
        res.add(new ArrayList(temp));
        
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            ans(i+1,nums,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}