class Solution {
    class node{
        int dist;
        int row;
        int col;
        node(int dist,int row,int col){
            this.dist=dist;
            this.row=row;
            this.col=col;
        }
    }
    public int shortestBridge(int[][] grid) {
        
        Queue<node> queue=new LinkedList();
        
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        boolean flag=false;
        int [][]dirs={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    //visited[i][j]=true;
                    //queue.offer
                     dfs(grid,queue,visited,i,j,dirs);
                    flag=true;
                    break;
                    
                }
            }
            if(flag==true)break;
        }
        
        
       
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 System.out.print(visited[i][j]+" ");
//             }
//             System.out.println();
//         }
//         return 1;
        
        int max_length=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                
               // System.out.println(size);
                node curr=queue.poll();
                //if(grid[curr.row][curr.col]==1)return max_length;
                
                if(curr.dist>max_length)max_length=curr.dist;
                for(int []dir:dirs){
                    
                    int curr_row=curr.row+dir[0];
                    int curr_col=curr.col+dir[1];
                   
                     // System.out.println(curr_row+" "+curr_col);
                    if(curr_row<0||curr_col<0||curr_row>=grid.length||
                       curr_col>=grid[0].length||
                       visited[curr_row][curr_col]==true)continue;
                    //System.out.println(curr_row+" "+curr_col);
                    if(grid[curr_row][curr_col]==1)return max_length;
                    visited[curr_row][curr_col]=true;
                    queue.offer(new node(curr.dist+1,curr_row,curr_col));
                    
                }
                
                
                
            }
                
            
        }
        return max_length;
        
    }
    
    
    public void dfs(int [][] grid,Queue<node> queue,boolean[][]visited ,int i, int j,int [][]dirs){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||visited[i][j]==true||grid[i][j]==0)return;
        
        visited[i][j]=true;
        queue.offer(new node(0,i,j));
        for(int[] curr_dir:dirs){
            int row=i+curr_dir[0];
            
            int col=j+curr_dir[1];
            dfs(grid,queue,visited,row,col,dirs);
        }
        
    }
}