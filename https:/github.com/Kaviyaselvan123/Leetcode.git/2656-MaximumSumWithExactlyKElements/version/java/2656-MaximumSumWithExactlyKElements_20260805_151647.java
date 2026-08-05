// Last updated: 8/5/2026, 3:16:47 PM
1class Solution {
2    public int maximizeSum(int[] nums, int k) {
3      Arrays.sort(nums);
4      int max=nums[nums.length-1],kd=nums[nums.length-1];
5      for(int i=0;i<k-1;i++){
6        max++;
7        kd+=max;
8      }  
9return kd;
10    }
11}