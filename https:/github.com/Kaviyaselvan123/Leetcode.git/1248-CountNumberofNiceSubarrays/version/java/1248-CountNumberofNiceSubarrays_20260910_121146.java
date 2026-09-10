// Last updated: 9/10/2026, 12:11:46 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return atMost(nums, k) - atMost(nums, k-1);
4    }
5    public int atMost(int[] nums, int k) {
6        int left = 0;
7        int count = 0;
8        int ans = 0;
9        for (int right=0; right<nums.length; right++) {
10            if (nums[right]%2==1) {
11                count++;
12            }
13            while (count>k) {
14                if (nums[left]%2==1) {
15                    count--;
16                }
17                left++;
18            }
19            ans+=right-left+1;
20        }
21        return ans;
22    }
23}