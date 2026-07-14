// Last updated: 7/14/2026, 2:26:42 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int l=0,r=nums.length-1;
4        while(l<=r){
5            int m=l+(r-l)/2;
6            if(nums[m]>nums[r]){
7                l=m+1;
8            }else if(nums[m]<nums[r]){
9                r=m;
10            }else{
11                r--;
12            }
13        }
14        return nums[l];
15    }
16}