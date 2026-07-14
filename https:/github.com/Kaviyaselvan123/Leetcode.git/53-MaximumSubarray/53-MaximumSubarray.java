// Last updated: 7/14/2026, 2:06:16 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>(cs+nums[i])){
                cs=nums[i];
            }else{
                cs=cs+nums[i];
            }
            if(cs>max){
                max=cs;
            }
        }
        return max;
    }
}