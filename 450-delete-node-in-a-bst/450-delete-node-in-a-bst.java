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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key)root.right=deleteNode(root.right,key);
        else{
            
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;
            else{
                TreeNode right_most=root.left;
                while(right_most.right!=null){
                    // System.out.println(right_most.val);
                    right_most=right_most.right;
                   
                }
                
                right_most.right=root.right;
                
                return root.left;
            }
        }
        
        
        return root;
        
    }
    
//     public TreeNode find(TreeNode root,int key){
//         if(root==null)return null;
//         if(root.val==key)return root;
        
        
//         if(root.val>key)return find(root.left,key);
//         else return find(root.right,key);
//     }
}