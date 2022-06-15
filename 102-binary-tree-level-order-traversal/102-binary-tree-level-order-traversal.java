/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *   right  this.val = val;
 *         thirightft
 = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        List<List<Integer>>allLevel=new LinkedList<List<Integer>>();
        if(root==null)return allLevel;
        queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
                List<Integer>currLevel=new LinkedList<Integer>();
                for(int i=0;i<n;i++){
                    if(queue.peek().left!=null)queue.offer(queue.peek().left);
                    if(queue.peek().right!=null)queue.offer(queue.peek().right);
                    currLevel.add(queue.peek().val);
                    queue.poll();
                }
            allLevel.add(currLevel);
            
        }
        return allLevel;
    }
}