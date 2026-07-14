// Last updated: 7/14/2026, 2:05:41 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
                if(nums[i]==nums[i+1]){
                    c++;
                    if(c>=1){
                        return true;
                    }
                }
        }
        return false;
    }
}