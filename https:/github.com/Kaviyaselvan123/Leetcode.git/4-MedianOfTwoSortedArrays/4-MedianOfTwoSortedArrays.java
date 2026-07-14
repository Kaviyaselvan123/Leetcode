// Last updated: 7/14/2026, 2:06:36 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length+nums2.length;
        int a[]=new int[x];
        int k=0,d=0;
        for(int i=0;i<x;i++){
            if(k<nums1.length){
                a[i]=nums1[k];
                k++;
            }else{
                a[i]=nums2[d];
                d++;
            }
        }
        Arrays.sort(a);
        if(a.length%2!=0){
            double z=a[a.length/2];
            return z;
        }else{
            double y=a[a.length/2]+a[(a.length/2)-1];
            return y/2;
        }
    }
}