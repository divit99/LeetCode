class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>> res=new ArrayList();
        List<Integer>temp=new ArrayList();
        ans(0,target,candidates,temp,res,0);
        return res;
    }
       void ans(int val,int target,int [] nums, List<Integer>temp,List<List<Integer>> res,int sum ){
           if(sum>target)return; 
           if(sum==target)
           res.add(new ArrayList(temp));
        
        for(int i=val;i<nums.length;i++){
            temp.add(nums[i]);
            ans(i,target,nums,temp,res,sum+nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}


