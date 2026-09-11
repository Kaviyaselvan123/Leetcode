// Last updated: 9/11/2026, 12:04:41 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int max=0,l=0;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int r=0;r<fruits.length;r++){
6            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
7            while(map.size()>2){
8                map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
9                if(map.get(fruits[l])==0){
10                    map.remove(fruits[l]);
11                }
12                l++;
13            }
14            max=Math.max(max,r-l+1);
15        }
16        return max;
17    }
18}