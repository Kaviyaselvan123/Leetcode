// Last updated: 8/12/2026, 4:33:32 PM
1class Solution {
2    public int countDigits(int num) {
3    int x=num,s=0;
4    while(x!=0){
5        int d=x%10;
6        if(num%d==0){
7            s++;
8        }
9                System.out.println(d);
10
11        x=x/10;
12    }
13    return s; 
14    }
15}