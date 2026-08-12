// Last updated: 8/12/2026, 6:14:58 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int freq[]=new int[nums.length+1];
4        for(int x:nums){
5            freq[x]++;
6        }
7        int d=0,k=0;
8        for(int i=1;i<=nums.length;i++){
9            if(freq[i]==2){
10                d=i;
11            }
12            if(freq[i]==0){
13                k=i;
14            }
15        }
16        return new int[]{d,k};
17    }
18}