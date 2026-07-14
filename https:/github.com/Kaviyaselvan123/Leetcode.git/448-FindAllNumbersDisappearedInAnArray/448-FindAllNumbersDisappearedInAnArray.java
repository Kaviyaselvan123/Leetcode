// Last updated: 7/14/2026, 2:05:11 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=nums[index]*-1;
            }
        }
            for(int j=0;j<nums.length;j++){
                if(nums[j]>0){
                    list.add(j+1);
                }
            }
    
        return list;
    }
}