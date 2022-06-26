class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> res=new ArrayList();
        List<Integer> curr =new ArrayList();
        
        ans(1,n,k,curr,res);
        return res;
        
    }
    
    void ans(int val,int size,int k, List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==k){
            res.add(new ArrayList(curr));
        }
        for(int i=val;i<=size;i++){
            curr.add(i);
            ans(i+1,size,k,curr,res);
            curr.remove(curr.size()-1);
                
        }
    }
}