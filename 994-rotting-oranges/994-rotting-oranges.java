class Solution {
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<pair> queue=new LinkedList();
        int total=0,rotten=0;
    boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1||grid[i][j]==2)total++;
                if(grid[i][j]==2){
                    rotten++;
                    queue.offer(new pair(i,j));
                    
                }
            }
        }
         if(rotten==total)return 0;
       // System.out.println(queue.size());
            int times=0;
                int [][]dirs={{1,0},{-1,0},{0,1},{0,-1}};
                while(!queue.isEmpty()){
                 if(rotten==total)return times;
                int size=queue.size();
                System.out.println(size+" "+rotten);
                for(int i=0;i<size;i++){
              
                
                pair curr=queue.poll();
                
                int curr_row=curr.row;
                int curr_col=curr.col;
                grid[curr_row][curr_col]=2;    
                visited[curr_row][curr_col]=true;
                    for(int[]dir:dirs){
                        
                        int x=curr_row+dir[0];
                        int y=curr_col+dir[1];
                        if(x<0||y<0||x>=row||y>=col||grid[x][y]==2||
                           grid[x][y]==0)continue;
                        
                        queue.offer(new pair(x,y));
                        grid[x][y]=2;
                        rotten++;
                        
                        
                    }
                    
            
                
                }
                    times++;
            }
        
            
            return -1;
                
        }
    
    }
    
