// Last updated: 7/14/2026, 2:04:39 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int b[]=new int[nums.length];
        int c=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            b[i]=ran(nums[i]);
            c=Math.max(c,b[i]);
        }
        int s=0;
        for(int i=0;i<b.length;i++){
            if(c==b[i]){
                s+=nums[i];
            }
        }
        return s;
    }
    public static int ran(int a){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(a>0){
            max=Math.max(max,a%10);
            min=Math.min(min,a%10);
            a=a/10;
        }
        return max-min;
    }
}