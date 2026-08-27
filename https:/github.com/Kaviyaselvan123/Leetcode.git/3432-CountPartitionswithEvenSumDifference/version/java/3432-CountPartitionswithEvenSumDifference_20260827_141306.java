// Last updated: 8/27/2026, 2:13:06 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3      int p[]=new int[nums.length-1];
4      p[0]=nums[0];
5      for(int i=1;i<p.length;i++){
6        p[i]=p[i-1]+nums[i];
7      }  
8      int s[]=new int[nums.length-1];
9      s[s.length-1]=nums[nums.length-1];
10      for(int i=s.length-2;i>=0;i--){
11        s[i]=nums[i+1]+s[i+1];
12      }
13      int e=0;
14      for(int i=0;i<p.length;i++){
15        if((p[i]+s[i])%2==0) e++;
16      }
17      return e;
18    }
19}