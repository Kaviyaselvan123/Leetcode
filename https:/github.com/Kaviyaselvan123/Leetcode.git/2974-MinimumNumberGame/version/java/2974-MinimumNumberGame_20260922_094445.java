// Last updated: 9/22/2026, 9:44:45 AM
1class Solution {
2    public int[] numberGame(int[] nums) {
3        int a[]=new int[nums.length];
4        Arrays.sort(nums);
5        int i=0,j=1;
6        while(j<nums.length){
7            a[j]=nums[i];
8            a[i]=nums[j];
9            i+=2;
10            j+=2;
11        }
12        return a;
13    }
14}