class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nrow=matrix.length-1;
        int ncol=matrix[0].length-1;
        int row=0;
        while(row<=nrow&&ncol>=0){
            
            if(target==matrix[row][ncol])return true;
            else if(target<matrix[row][ncol])ncol--;
            else row++;
        }
        return false;
        
    }
}