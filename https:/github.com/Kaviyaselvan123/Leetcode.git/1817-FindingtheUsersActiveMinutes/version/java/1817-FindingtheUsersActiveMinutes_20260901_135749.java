// Last updated: 9/1/2026, 1:57:49 PM
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3      int a[]=new int[k];
4      HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
5      for(int b[]:logs){
6        int id=b[0],am=b[1];
7        if(!map.containsKey(id)){
8            map.put(id,new HashSet<>());
9        }
10        map.get(id).add(am);
11      }
12      for(HashSet<Integer> set:map.values()){
13        int m=set.size();
14        a[m-1]++;
15      }
16      return a; 
17    }
18}