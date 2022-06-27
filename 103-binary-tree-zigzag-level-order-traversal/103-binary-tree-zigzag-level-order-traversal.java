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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res =new ArrayList();
        
        Queue<TreeNode> q=new LinkedList();
        if(root==null)return res;
        
        q.offer(root);
        int dir=0;
        while(!q.isEmpty()){
            int size=q.size();
            
             List<Integer> temp=new ArrayList();
            Stack<Integer> st=new Stack();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
            if(dir%2==0){
                temp.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
                
            }
            else{
                  st.push(curr.val);
                  if(curr.left!=null)q.offer(curr.left);
                  if(curr.right!=null)q.offer(curr.right);
                
            }
                
           }
            if(temp.size()==0){
                //System.out.println(st.size());
                    while(!st.isEmpty()){
                        temp.add(st.pop());
                    }
                }
                res.add(temp);
            dir++;
            
            
        }
        
        return res;
        
    }
}