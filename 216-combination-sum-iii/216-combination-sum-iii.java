class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res=new ArrayList();
        List<Integer> curr=new ArrayList();
        ans(1,n,k,curr,res);
        return res;
    }
    
    void ans(int val,int target,int k,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==k){
            int sum=0;
            for(int i=0;i<curr.size();i++){
                sum+=curr.get(i);
            }
            if(sum==target)res.add(new ArrayList(curr));
        }
        
        for(int i=val;i<=9;i++){
            curr.add(i);
            ans(i+1,target,k,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}