// Last updated: 8/13/2026, 11:17:29 AM
1class Solution {
2    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
3        int a[]=new int[2];
4        int c=0;
5        for(int i=0;i<nums1.length;i++){
6            for(int j=0;j<nums2.length;j++){
7                if(nums1[i]==nums2[j]){
8                    c++;
9                    break;
10                }
11            }
12        }
13        a[0]=c;
14        int s=0;
15        for(int i=0;i<nums2.length;i++){
16            for(int j=0;j<nums1.length;j++){
17                if(nums2[i]==nums1[j]){
18                  s++;
19                  break;
20                }
21            } 
22        }
23        a[1]=s;
24        return a;
25    }
26}