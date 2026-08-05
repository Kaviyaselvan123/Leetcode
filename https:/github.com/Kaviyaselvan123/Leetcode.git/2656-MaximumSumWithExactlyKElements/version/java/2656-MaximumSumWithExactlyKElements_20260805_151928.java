// Last updated: 8/5/2026, 3:19:28 PM
1class Solution {
2    public int maximizeSum(int[] nums, int k) {
3      int max=0;
4      for(int i=0;i<nums.length;i++){
5        max=Math.max(max,nums[i]);
6      }
7      int kd=max;
8      for(int i=0;i<k-1;i++){
9        max++;
10        kd+=max;
11      }  
12return kd;
13    }
14}