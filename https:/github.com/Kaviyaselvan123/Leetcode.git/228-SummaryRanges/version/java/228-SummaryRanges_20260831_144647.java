// Last updated: 8/31/2026, 2:46:47 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> a=new ArrayList<>();
4        HashSet<Long> set=new HashSet<>();
5        for(long x:nums){
6            set.add(x);
7        }
8        int c=0;
9        for(int i=0;i<nums.length;i++){
10            c++;
11            if(!set.contains((long)nums[i]+1)){
12                if(c==1){
13                    a.add(String.valueOf(nums[i]));
14                }else{
15                    int v=Math.abs(c-i-1);
16                    String w=nums[v]+"->"+nums[i];
17                    a.add(w);
18                }
19                c=0;
20            }
21
22        }
23        return a;
24    }
25}