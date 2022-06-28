/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList();
         List<Integer> temp=new ArrayList();
       // temp.add(root.val);
        sum(root,targetSum,temp,res);
        return res;
        
    }
    public void sum(TreeNode root,int target,List<Integer> temp, List<List<Integer>>res){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            if(root.val==target){
                
                //temp.add(root.val);
              //  System.out.println(temp);
                List<Integer> ans=new ArrayList(temp);
                //ans=temp;
                ans.add(root.val);
                res.add(ans);
               // temp.remove(temp.size()-1);
            }
             return;
        }
        
        temp.add(root.val);
        sum(root.left,target-root.val,temp,res);
        // temp.remove(temp.size()-1);
        //temp.add(root.right.val);
        sum(root.right,target-root.val,temp,res);
        temp.remove(temp.size()-1);
        
    }
}