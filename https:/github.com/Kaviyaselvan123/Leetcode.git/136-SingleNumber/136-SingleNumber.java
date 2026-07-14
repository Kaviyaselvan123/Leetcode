// Last updated: 7/14/2026, 2:05:55 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums){
            res=res^n;
        }
        return res;
    }
}