// Last updated: 7/31/2026, 11:40:07 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(j!=i){
                    max=Math.max(max,((nums[i]-1)*(nums[j]-1)));
                }
            }
        }
        return max;
    }
}