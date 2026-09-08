// Last updated: 9/8/2026, 3:13:09 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n==1) return true;
4        if(n==Integer.MAX_VALUE) return false;
5        for(int i=1;i<=Math.sqrt(n);i++){
6            int x=(int)Math.pow(3,i);
7            if(x==n) return true;
8        }
9        return false;
10    }
11}