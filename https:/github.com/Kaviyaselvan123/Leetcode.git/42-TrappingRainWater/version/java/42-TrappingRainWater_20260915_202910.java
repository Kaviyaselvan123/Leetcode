// Last updated: 9/15/2026, 8:29:10 PM
1class Solution {
2    public int trap(int[] height) {
3     int l=0,r=height.length-1;
4     int lm=height[l],rm=height[r];
5     int s=0;
6     while(l<r){
7        if(lm<rm){
8            l+=1;
9            lm=Math.max(lm,height[l]);
10            s+=lm-height[l];
11        }else{
12            r-=1;
13            rm=Math.max(rm,height[r]);
14            s+=rm-height[r];
15        }
16     }    
17     return s;
18    }
19}