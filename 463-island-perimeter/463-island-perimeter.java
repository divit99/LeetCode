class Solution {
    public int islandPerimeter(int[][] grid) {
        
       // boolean [][] visited=new boolean[grid.length][grid[0].length];
        
        int ans[]=new int [1];
        ans[0]=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return dfs(grid,i,j);
                }
            }
        }
        
        return -1;
    }
    
    
    public int dfs(int [][]grid,int row,int col){
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0)return 1;//valid boundary
        if(grid[row][col]==2)return 0;
        
        grid[row][col]=2;
        
         int top=dfs(grid,row+1,col);//top
        
         int bottom=dfs(grid,row-1,col);
        
        int right=dfs(grid,row,col+1);
        
        int left = dfs(grid,row,col-1);
        
        
        return top+bottom+right+left;
    }
}