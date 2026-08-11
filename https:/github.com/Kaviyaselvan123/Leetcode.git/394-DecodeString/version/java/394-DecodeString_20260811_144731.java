// Last updated: 8/11/2026, 2:47:31 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int max=0;
8        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
9            if(entry.getValue()==1){
10                max= entry.getKey();
11            }
12        }  
13        return max;
14    }
15}