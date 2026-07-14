// Last updated: 7/14/2026, 2:04:55 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][] arr=new int[m][n];
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               arr[j][i]=matrix[i][j];
            }
        }
        return arr; 
    }
}