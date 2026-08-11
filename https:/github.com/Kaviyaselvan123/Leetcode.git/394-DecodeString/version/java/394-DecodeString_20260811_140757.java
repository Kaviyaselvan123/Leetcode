// Last updated: 8/11/2026, 2:07:57 PM
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int[] a=new int[2];
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<grid.length;i++){
6            for(int j=0;j<grid[0].length;j++){
7                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
8            }
9        }
10        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
11            if(entry.getValue()>1){
12                a[0]=entry.getKey();
13            }
14        }
15        for(int i=1;i<=grid.length*grid.length;i++){
16            if(!map.containsKey(i)){
17                a[1]=i;
18                return a;
19            }
20        }
21        return a;
22    }
23}