// Last updated: 8/27/2026, 2:21:05 PM
1class Solution {
2    public int minMoves2(int[] nums) {
3      Arrays.sort(nums);
4      int m=nums[nums.length/2],c=0;
5      for(int i=0;i<nums.length;i++){
6        c+=Math.abs(nums[i]-m);
7      }
8      return c;
9    }
10}