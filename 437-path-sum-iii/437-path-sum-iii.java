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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        int arr[]=new int[1];
        arr[0]=0;
         helper(root,targetSum,arr);
          return arr[0]+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    
    public void helper(TreeNode root,int target,int arr[]){
        if(root==null)return ;
        if(root.val==target)arr[0]++;
        helper(root.left,target-root.val,arr);
        helper(root.right,target-root.val,arr);
    } 
}