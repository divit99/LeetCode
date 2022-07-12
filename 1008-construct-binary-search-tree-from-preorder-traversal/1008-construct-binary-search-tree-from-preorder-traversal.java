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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        int arr[]=new int[1];
        arr[0]=0;
        return ans(preorder,Integer.MAX_VALUE,arr);
        
    }
    
    public TreeNode ans(int [] preorder,int max,int []idx){
        if(idx[0]>=preorder.length||preorder[idx[0]]>max)return null;
        
        TreeNode root=new TreeNode(preorder[idx[0]]);
        idx[0]++;
        root.left=ans(preorder,root.val,idx);
        root.right=ans(preorder,max,idx);
        return root;
            
            
            
        
    }
}