// Last updated: 9/11/2026, 10:01:16 AM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        int c=0,r=0;
8        for(int x:map.keySet()){
9            if(map.get(x)>=k){
10                c+=k;
11            }else{
12                c+=map.get(x);
13            }
14        }
15        int b[]=new int[c];
16        for(int x:map.keySet()){
17            if(map.get(x)>=k){
18                for(int i=0;i<k;i++){
19                    b[r]=x;
20                    r++;
21                }
22            }else{
23                for(int i=0;i<map.get(x);i++){
24                    b[r]=x;
25                    r++;
26                }
27            }
28        }
29        Arrays.sort(b);
30        return b;
31    }
32}