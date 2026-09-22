// Last updated: 9/22/2026, 9:36:15 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3       HashSet<Integer> set=new HashSet<>();
4       for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6       } 
7       for(int i=1;i<=Integer.MAX_VALUE;i++){
8        if(!set.contains(i)){
9            return i;
10        }
11       }
12       return 0;
13    }
14}