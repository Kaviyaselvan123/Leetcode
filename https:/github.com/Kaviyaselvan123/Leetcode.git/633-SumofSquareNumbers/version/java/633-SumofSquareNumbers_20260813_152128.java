// Last updated: 8/13/2026, 3:21:28 PM
1class Solution {
2    public boolean judgeSquareSum(int c) { 
3      long l=0,r=(long)Math.sqrt(c);
4      while(l<=r){
5        long k=l*l+r*r;
6        if(k==c){
7            return true;
8        }else if(k>c){
9            r--;
10        }else{
11            l++;
12        }
13      }
14      return false; 
15    }
16}