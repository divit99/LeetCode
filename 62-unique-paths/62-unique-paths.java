class Solution {
    public int uniquePaths(int m, int n) {

        int past_ans[][]=new int[m][n];
        return sol(m-1,n-1,m,n,past_ans);
    }
    public int sol(int i,int j,int row,int col,int[][]arr){
        if(i<0||j<0||i>=row||j>=col)return 0;
        if(i==0&&j==0)return 1;
        if(arr[i][j]!=0)return arr[i][j];
        
        arr[i][j]= sol(i-1,j,row,col,arr)+sol(i,j-1,row,col,arr);
        return arr[i][j];
    }
}