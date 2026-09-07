// Last updated: 9/7/2026, 12:34:24 PM
1class Solution {
2    public int maximumSum(int[] nums) {
3        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
4        for(int x:nums){
5            int a=x,s=0;
6            while(a>0){
7                s+=(a%10);
8                a=a/10;
9            }
10            map.computeIfAbsent(s,k -> new ArrayList<>()).add(x);
11        }
12        int max=-1;
13        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
14            if(entry.getValue().size()>=2){
15                int xs=0,first=0,second=0;
16                for(int v:entry.getValue()){
17                    if (v > first) {
18                        second = first;
19                        first = v;
20                    } 
21                    else if (v > second) {
22                        second = v;
23                    };
24                }
25                xs=xs+first+second;
26                if(xs>max){
27                    max=xs;
28                }
29            }
30        }
31        if(max==-1) return -1;
32        return max;
33        
34    }
35}