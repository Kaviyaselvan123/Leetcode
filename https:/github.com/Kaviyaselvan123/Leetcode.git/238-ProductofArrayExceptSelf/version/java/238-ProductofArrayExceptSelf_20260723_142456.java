// Last updated: 7/23/2026, 2:24:56 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3     int p[]=new int[nums.length];
4     int s[]=new int[nums.length];
5     p[0]=1;
6     s[nums.length-1]=1;
7     for(int i=1;i<nums.length;i++){
8        p[i]=p[i-1]*nums[i-1];
9     }
10     for(int i=nums.length-2;i>=0;i--){
11        s[i]=s[i+1]*nums[i+1];
12     }
13     for(int i=0;i<nums.length;i++){
14        p[i]=p[i]*s[i];
15     }
16     return p;
17    }
18}