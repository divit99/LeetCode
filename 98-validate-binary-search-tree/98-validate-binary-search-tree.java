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
    public boolean isValidBST(TreeNode root) {
        
        Stack<TreeNode> st=new Stack();
        TreeNode node=root;
        int check=Integer.MIN_VALUE;
        TreeNode pre=null;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty())break;
                node=st.pop();
                if(pre!=null&&node.val<=pre.val)return false;
                
                check=node.val;
                pre=node;
                node=node.right;
            }
        }
        return true;
        
        
        
    }
}