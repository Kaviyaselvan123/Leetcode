// Last updated: 8/12/2026, 2:44:16 PM
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3      int s=0;
4      for(int i=0;i<arr.length;i++){
5        for(int j=i;j<arr.length;j++){
6            if((j-i+1)%2!=0){
7                s+=add(arr,i,j);
8            }
9        }
10      }
11      return s;  
12    }
13    public static int add(int[] arr,int i,int j){
14        int r=0;
15        for(int k=i;k<=j;k++){
16            r+=arr[k];
17        }
18        return r;
19
20    }
21}