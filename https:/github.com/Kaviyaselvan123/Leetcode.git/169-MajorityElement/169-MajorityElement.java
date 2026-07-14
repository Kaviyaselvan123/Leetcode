// Last updated: 7/14/2026, 2:05:46 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>n){
                return nums[i];
            }
        }
        return -1;
    }
}