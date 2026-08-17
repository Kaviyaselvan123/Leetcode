// Last updated: 8/17/2026, 2:03:37 PM
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3       int m=0,c=0;
4       for(int i=0;i<nums.length-1;i++){
5        if(nums[i]<nums[i+1]){
6            c++;
7        }else{
8            c=0;
9        }
10        m=Math.max(m,c);
11       }
12       return m+1;
13    }
14}