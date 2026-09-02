// Last updated: 9/2/2026, 3:05:24 PM
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        int max=nums[0];
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]>max){
6                max=nums[i];
7            }
8        }
9        int i=0,j=1;
10        if(nums[0]==max){
11            while(j<nums.length){
12                if(nums[i]<nums[j]) return false;
13                i++;
14                j++;
15            }
16        }else{
17            while(j<nums.length){
18                if(nums[i]>nums[j]) return false;
19                i++;
20                j++;
21            }
22        }
23        return true;
24    }
25}