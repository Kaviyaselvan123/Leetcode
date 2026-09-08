// Last updated: 9/8/2026, 12:04:37 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int min=Integer.MAX_VALUE,l=0,s=0;
4        for(int r=0;r<nums.length;r++){
5            s+=nums[r];
6            while(s>=target){
7                min=Math.min(min,r-l+1);
8                s-=nums[l];
9                l++;
10            }
11        }
12        return min==Integer.MAX_VALUE?0:min;
13    }
14}