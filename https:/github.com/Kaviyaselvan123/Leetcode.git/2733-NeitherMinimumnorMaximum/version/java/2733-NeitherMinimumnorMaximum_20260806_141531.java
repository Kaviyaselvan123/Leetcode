// Last updated: 8/6/2026, 2:15:31 PM
1class Solution {
2    public int findNonMinOrMax(int[] nums) {
3        if(nums.length<=2){
4            return -1;
5        }
6        Arrays.sort(nums);
7        return nums[1];
8    }
9}