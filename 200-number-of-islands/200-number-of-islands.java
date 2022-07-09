class Solution {
    public int numIslands(char[][] grid) {
        
    boolean[][]visited=new boolean[grid.length][grid[0].length];
        int count=0;
       // System.out.println(grid.length+" "+grid[0].length);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==false&&grid[i][j]=='1'){
                    islands(grid,visited,i,j);
                   // System.out.println(i+" "+j);
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void islands(char[][]grid,boolean[][]visited,int row,int col){
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||visited[row][col]==true||grid[row][col]=='0')return;
        
        visited[row][col]=true;
        islands(grid,visited,row,col+1);
        islands(grid,visited,row,col-1);
        islands(grid,visited,row+1,col);
        islands(grid,visited,row-1,col);
        return;
        
        
    }
    
    
}