// Last updated: 7/14/2026, 2:04:40 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] b=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            b[i]=nums[i];
        }
        for(int i=nums.length;i<b.length;i++){
            b[i]=nums[b.length-i-1];
        }
        return b;
    }
}