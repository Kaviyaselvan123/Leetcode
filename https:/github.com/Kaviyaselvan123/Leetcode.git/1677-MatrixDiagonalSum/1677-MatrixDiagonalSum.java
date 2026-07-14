// Last updated: 7/14/2026, 2:04:46 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int d1=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j||i+j==mat.length-1) d1+=mat[i][j];
            }
        }
       return d1;
    }
}