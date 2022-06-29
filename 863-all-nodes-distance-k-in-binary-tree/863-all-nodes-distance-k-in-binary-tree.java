/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<TreeNode> ans=new ArrayList();
        boolean check=path(root,target,ans);
        List<Integer> temp=new ArrayList();
        if(check){
            for(int i=0;i<ans.size();i++){
                if(i==0) nodes(ans.get(i),k,null,temp);
               else nodes(ans.get(i),k-i,ans.get(i-1),temp);
            }
        }
         // List<Integer> temp=new ArrayList();
        return temp;
    }
    public void nodes(TreeNode curr,int k,TreeNode block,List<Integer> down){
        if(curr==null||k<0||curr==block)return;
        
        if(k==0){
            down.add(curr.val);
            return;
        }
        nodes(curr.left,k-1,block,down);
        nodes(curr.right,k-1,block,down);
        return;
    }
    public boolean path(TreeNode root, TreeNode target,List<TreeNode> ans){
        if(root==null)return false;
        
        if(root==target){
            ans.add(root);
            return true;
        }
        
        boolean left=path(root.left,target, ans);
        boolean right=path(root.right,target, ans);
        if(left||right){
            ans.add(root);
            return true;
        }
        
        return false;
        
        
    }
}