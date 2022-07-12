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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        
        int arr[]=new int[1];
        arr[0]=0;
        return ans(preorder,inorder,0,inorder.length-1,arr);
        
    }
    
    public int findpos(int []in,int search){
        for(int i=0;i<in.length;i++){
            if(in[i]==search)return i;
        }
        return -1;
    }
    public TreeNode ans(int []pre,int []in,int start,int end,int []idx){
        
        if(start>end)return null;
        
        TreeNode root=new TreeNode(pre[idx[0]]);
        idx[0]++;
        if(start==end)return root;
        int pos=findpos(in,root.val);
        //System.out.println(pos);
        
        root.left=ans(pre,in,start,pos-1,idx);
        root.right=ans(pre,in,pos+1,end,idx);
        return root;
    } 
}