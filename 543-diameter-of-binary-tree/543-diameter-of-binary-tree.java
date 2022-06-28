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

class tpair{
    int height=0;
    int diameter=0;
    tpair(int height,int diameter){
        this.height=height;
        this.diameter=diameter;
    }
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        return diameter(root).diameter;
        
    }
    
    public tpair diameter(TreeNode root){
        if(root==null){
           
            return new tpair(0,0);
        }
        
        tpair tpair_left=diameter(root.left);
        tpair tpair_right=diameter(root.right);
        
        int height=Math.max(tpair_left.height,tpair_right.height)+1;
        int node_diameter=(tpair_left.height+tpair_right.height);
        int diameter=Math.max(node_diameter,Math.max(tpair_left.diameter,tpair_right.diameter));
        return new tpair(height,diameter);
    }
}