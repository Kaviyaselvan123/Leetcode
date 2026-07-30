// Last updated: 7/30/2026, 11:43:08 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        int max=0,min=0;
4        for(char v:s.toCharArray()){
5            if(v=='('){
6                max++;
7                min++;
8            }else if(v==')'){
9                max--;
10                min--;
11            }else{
12                max++;
13                min--;
14            }
15            if(max<0) return false;
16            min=Math.max(0,min);
17        }
18        return min==0;
19    }
20}