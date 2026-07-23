// Last updated: 7/23/2026, 3:36:57 PM
1class Solution {
2    public int search(int[] nums, int target) {
3    int l=0,h=nums.length-1;
4    while(l<=h){
5        int m=l+(h-l)/2;
6        if(nums[m]==target){
7            return m;
8        }
9        if(nums[l]<=nums[m]){
10            if(target>=nums[l]&&target<nums[m]){
11                h=m-1;
12            }else{
13                l=m+1;
14            }
15        }else{
16            if(target>nums[m]&&target<=nums[h]){
17                l=m+1;
18            }else{
19                h=m-1;
20            }
21        }
22    }  
23    return -1;  
24    }
25}