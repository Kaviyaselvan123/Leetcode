// Last updated: 8/24/2026, 2:32:56 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6       HashMap<Character,Integer> map=new HashMap<>();
7       char []a=s.toCharArray();
8       char []b=t.toCharArray();
9       for(char x:a){
10        map.put(x,map.getOrDefault(x,0)+1);
11       }
12       for(char x:b){
13        map.put(x,map.getOrDefault(x,0)-1);
14        if(map.get(x)<0){
15            return false;
16        }
17       }
18      return true;
19    }
20}