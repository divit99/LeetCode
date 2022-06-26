class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        List<Integer> curr=new ArrayList();
        Arrays.sort(nums);
        ans(0,nums,curr,res);
        return res;
        
    }
     void ans(int index,int[] nums,List<Integer> curr,List<List<Integer>> res){
       
            res.add(new ArrayList(curr));
        
        
        for(int i=index;i<nums.length;i++){
            
            if(i==index||(i>index&&nums[i]!=nums[i-1]))
            {
            curr.add(nums[i]);
            ans(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
            }
        }
    }
}

