// Last updated: 7/31/2026, 11:32:01 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i;j<nums.length;j++){
6                if(j!=i){
7                    max=Math.max(max,((nums[i]-1)*(nums[j]-1)));
8                }
9            }
10        }
11        return max;
12    }
13}