// Last updated: 7/14/2026, 2:05:45 PM
class Solution {
    public void rotate(int[] nums, int k) {
    k=k%nums.length;
    rota(nums,0,nums.length-1);
    rota(nums,0,k-1);
    rota(nums,k,nums.length-1);
    }
    public static int[] rota(int[] a,int s,int e){
        int i=s,j=e;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        return a;
    }
}