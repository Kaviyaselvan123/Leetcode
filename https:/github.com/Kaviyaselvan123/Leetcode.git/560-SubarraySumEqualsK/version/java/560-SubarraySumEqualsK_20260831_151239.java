// Last updated: 8/31/2026, 3:12:39 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3    int c=0;
4    for(int i=0;i<nums.length;i++){
5        int s=0;
6        for(int j=i;j<nums.length;j++){
7            s+=nums[j];
8            if(s==k) c++;
9        }
10    }
11      return c;
12    }
13}