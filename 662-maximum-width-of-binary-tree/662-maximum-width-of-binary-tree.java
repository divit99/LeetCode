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
class answer{
    TreeNode root;
    int length;
    answer(TreeNode root,int length ){
        this.root=root;
        this.length=length;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<answer> q=new LinkedList();
        q.offer(new answer(root,1));
        int sol=0;
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
              answer temp=q.poll();
                min=Math.min(min,temp.length);
                max=Math.max(max,temp.length);
                if(temp.root.left!=null)q.offer(new answer((temp.root.left),temp.length*2+1));
                if(temp.root.right!=null)q.offer(new answer((temp.root.right),temp.length*2+2));
            }
            if((max-min+1)>sol)sol=max-min+1;
        }
        return sol;
    }
    
}