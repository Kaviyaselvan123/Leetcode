// Last updated: 8/12/2026, 4:55:57 PM
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer,Integer> map= new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int max=0;
8        for(int x:map.keySet()){
9            if(map.get(x)>max){
10                max=map.get(x);
11        }
12        }
13        int s=0;
14        for(int a:map.keySet()){
15            if(map.get(a)==max){
16                s+=map.get(a);
17        }
18        }
19        return s;
20    }
21}