// Last updated: 9/22/2026, 9:52:49 AM
1class Solution {
2    public int sumOfMultiples(int n) {
3        int s=0;
4        for(int i=1;i<=n;i++){
5            if(i%3==0||i%5==0||i%7==0){
6                s+=i;
7            }
8        }
9        return s;
10    }
11}