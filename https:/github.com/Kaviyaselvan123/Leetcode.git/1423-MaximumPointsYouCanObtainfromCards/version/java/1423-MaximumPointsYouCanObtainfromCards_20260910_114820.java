// Last updated: 9/10/2026, 11:48:20 AM
1class Solution {
2    public int maxScore(int[] c, int k) {
3        int max=0,s=0;
4        for(int i=0;i<k;i++){
5            s+=c[i];
6        }
7        if(s>max) max=s; 
8        int r=c.length-1;
9        for(int i=k-1;i>=0;i--){
10            s-=c[i];
11            s+=c[r]
12            ;
13            r--;
14            if(s>max) max=s;
15        }
16        return max;
17    }
18}