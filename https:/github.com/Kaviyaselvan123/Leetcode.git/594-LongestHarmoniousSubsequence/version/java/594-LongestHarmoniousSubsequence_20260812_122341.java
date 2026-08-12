// Last updated: 8/12/2026, 12:23:41 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        int s=0,c=0,max=0,min=0,v=0;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
7        }
8        for(int i=0;i<nums.length;i++){
9            for(int j=0;j<nums.length;j++){
10                if((nums[i]-nums[j])==1){
11                    if((map.get(nums[i])+map.get(nums[j]))>max){
12                        max=map.get(nums[i])+map.get(nums[j]);
13                    }
14                    s++;
15                }
16            }
17        }
18        if(s<1){
19            return 0;
20        }
21        return max;
22    }
23}