// Last updated: 9/24/2026, 3:01:49 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int a=nums[i];
5            int s=0;
6            while(a>0){
7                s+=a%10;
8                a=a/10;
9            }
10            if(s==i){
11                return i;
12            }
13        }
14        return -1;
15    }
16}