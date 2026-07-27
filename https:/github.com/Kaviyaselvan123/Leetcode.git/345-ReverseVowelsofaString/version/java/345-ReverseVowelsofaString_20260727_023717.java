// Last updated: 7/27/2026, 2:37:17 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        boolean a=false;
4        for(int i=0;i<nums.length-1;i++){
5            if(nums[i]>nums[i+1]){
6                if(a){
7                    return false;
8                }
9                if(i==0||nums[i-1]<=nums[i+1]){
10                    nums[i]=nums[i+1];
11                }else{
12                    nums[i+1]=nums[i];
13                }
14                a=true;
15            }
16        }
17        return true;
18    }
19}