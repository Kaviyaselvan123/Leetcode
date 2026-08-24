// Last updated: 8/24/2026, 12:28:18 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int s=0,p=1,x=n;
4        while(x>0){
5            s+=(x%10);
6            p*=(x%10);
7            x=x/10;
8        }
9        if(n%(s+p)==0){
10            return true;
11        }
12        return false;
13    }
14}