// Last updated: 9/10/2026, 9:06:40 AM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            int e=0,x=nums[i];
6            while(x>0){
7                e++;
8                x=x/10;
9            }
10            if(e%2==0){
11                c++;
12            }
13        }
14        return c; 
15    }
16}