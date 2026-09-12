// Last updated: 9/12/2026, 9:54:58 PM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        int m=0,s=0,l=0;
4        HashSet<Integer> set=new HashSet<>();
5        for(int r=0;r<nums.length;r++){
6            while(set.contains(nums[r])){
7                 set.remove(nums[l]);
8                 s-=nums[l];
9                 l++;
10            }
11            s+=nums[r];
12            set.add(nums[r]);
13            m=Math.max(m,s);
14        }
15        return m;
16    }
17}