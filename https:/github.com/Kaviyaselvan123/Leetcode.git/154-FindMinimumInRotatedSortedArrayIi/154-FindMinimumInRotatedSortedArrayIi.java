// Last updated: 7/31/2026, 11:42:06 AM
class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[r]){
                l=m+1;
            }else if(nums[m]<nums[r]){
                r=m;
            }else{
                r--;
            }
        }
        return nums[l];
    }
}