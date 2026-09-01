// Last updated: 9/1/2026, 2:35:43 PM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,1);
5        int s=0,c=0;
6        for(int x:nums){
7            s+=x;
8            int r=s%k;
9            if(r<0){
10                r+=k;
11            }
12            c+=map.getOrDefault(r,0);
13            map.put(r,map.getOrDefault(r,0)+1);
14        }
15        return c;
16    }
17}