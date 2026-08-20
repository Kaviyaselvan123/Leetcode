// Last updated: 8/20/2026, 2:15:06 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int m=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>m){
6                return false;
7            }
8            m=Math.max(m,i+nums[i]);
9            if(m>=nums.length-1){
10                return true;
11            }
12        }
13        return true;
14    }
15}