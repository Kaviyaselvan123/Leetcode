// Last updated: 9/11/2026, 12:28:07 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int max=0,ze=0;
4        int l=0;
5        for(int r=0;r<nums.length;r++){
6            if(nums[r]==0) ze++;
7            while(ze>k){
8                if(nums[l]==0){
9                    ze--;
10                }
11                l++;
12            }
13            max=Math.max(max,r-l+1);
14        }
15        return max;
16    }
17}