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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
      
           if(root.val==subRoot.val){
            
             if(check(root,subRoot))
              return true;
        }
        boolean left= isSubtree(root.left,subRoot);
        boolean right= isSubtree(root.right,subRoot);
        boolean abc=false;
//         if(root.val==subRoot.val){
            
//              abc=check(root,subRoot);
//             //System.out.println(abc);
//             //return abc;
//         }
        return left||right;
        
    }
    
    public boolean check(TreeNode root,TreeNode subRoot){
        if(root==null&&subRoot==null)return true;
        if(root==null||subRoot==null)return false;
        if(root.val!=subRoot.val)return false;
        
        return check(root.left,subRoot.left)&&check(root.right,subRoot.right);
    }
}