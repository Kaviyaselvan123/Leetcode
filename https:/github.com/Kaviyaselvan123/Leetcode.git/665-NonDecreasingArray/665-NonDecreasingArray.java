// Last updated: 7/31/2026, 11:40:49 AM
class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean a=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(a){
                    return false;
                }
                if(i==0||nums[i-1]<=nums[i+1]){
                    nums[i]=nums[i+1];
                }else{
                    nums[i+1]=nums[i];
                }
                a=true;
            }
        }
        return true;
    }
}