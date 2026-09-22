// Last updated: 9/22/2026, 9:33:23 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3       HashSet<Integer> set=new HashSet<>();
4       for(int i=0;i<nums.length;i++){
5        if(nums[i]>0){
6            set.add(nums[i]);
7        }
8       } 
9       for(int i=1;i<=Integer.MAX_VALUE;i++){
10        if(!set.contains(i)){
11            return i;
12        }
13       }
14       return 0;
15    }
16}