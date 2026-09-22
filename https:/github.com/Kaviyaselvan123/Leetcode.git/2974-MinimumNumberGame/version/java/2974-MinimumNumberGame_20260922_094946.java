// Last updated: 9/22/2026, 9:49:46 AM
1class Solution {
2    public int[] numberGame(int[] nums) {
3        int a[]=new int[nums.length];
4        PriorityQueue<Integer> k=new PriorityQueue<>();
5        int i=0;
6        for(int x:nums){
7            k.add(x);
8        }
9        while(i<nums.length){
10            int b=k.poll();
11            int c=k.poll();
12            a[i++]=c;
13            a[i++]=b;
14        }
15        return a;
16    }
17}