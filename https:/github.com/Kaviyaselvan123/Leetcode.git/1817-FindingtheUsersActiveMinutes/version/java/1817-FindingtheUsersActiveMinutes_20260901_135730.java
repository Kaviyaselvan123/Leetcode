// Last updated: 9/1/2026, 1:57:30 PM
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3      int a[]=new int[k];
4      HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
5      for(int b[]:logs){
6        int id=b[0],am=b[1];
7        map.putIfAbsent(id,new HashSet<>());
8        map.get(id).add(am);
9      }
10      for(HashSet<Integer> set:map.values()){
11        int m=set.size();
12        a[m-1]++;
13      }
14      return a; 
15    }
16}