// Last updated: 8/12/2026, 3:30:55 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int c=0;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
7        }
8        for(int x:map.keySet()){
9            if(map.get(x)==1){
10                c+=x;
11            }
12        }
13        return c;
14    }
15}