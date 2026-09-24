// Last updated: 9/24/2026, 3:00:28 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        int min=Integer.MAX_VALUE,t=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            int a=nums[i];
6            int s=0;
7            while(a>0){
8                s+=a%10;
9                a=a/10;
10            }
11            if(s==i){
12                t=i;
13            }
14            if(t<min){
15                min=t;
16            }
17        }
18        if(min==Integer.MAX_VALUE) return -1;
19        return min;
20    }
21}