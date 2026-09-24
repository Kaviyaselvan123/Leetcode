// Last updated: 9/24/2026, 3:57:16 PM
1class Solution {
2    public int climbStairs(int n) {
3        int a=1,b=2,c=3,d=0;
4        if(n>=1&&n<=3) return n;
5        while(n-->3){
6            d=b+c;
7            a=b;
8            b=c;
9            c=d;
10        }
11        return d;
12    }
13}