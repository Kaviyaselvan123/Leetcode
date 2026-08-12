// Last updated: 8/12/2026, 1:29:29 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        int ans=0;
8        for(int x:map.keySet()){
9            if(map.containsKey(x+1)){
10                ans=Math.max(ans,map.get(x)+map.get(x+1));
11            }
12        }
13        return ans;
14    }
15}